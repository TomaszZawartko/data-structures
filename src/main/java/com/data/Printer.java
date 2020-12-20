package com.data;

import com.data.node.Node;
import com.data.node.container.ArrayNode;
import com.data.node.container.MapNode;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public class Printer {

    private final Map<String, Node> flattenedMapNode = new LinkedHashMap<>(64);
    private final Node root;

    public Printer(final Node node) {
        this.root = Objects.requireNonNull(node);
    }

    private void flatten(final Node node, final String prefix) {
        if (node.isMap()) {
            final MapNode mapNode = (MapNode) node;
            mapNode.getFieldNames().forEachRemaining(entry -> flatten(entry.getValue(), prefix + "." + entry.getKey()));
        } else if (node.isArray()) {
            final AtomicInteger counter = new AtomicInteger();
            final ArrayNode arrayNode = (ArrayNode) node;
            arrayNode.elements().forEachRemaining(element -> flatten(element, prefix + "." + counter.getAndIncrement()));
        } else {
            flattenedMapNode.put(prefix, node);
        }
    }

    public void print() {
        if(flattenedMapNode.isEmpty()){
            flatten(root,"");
        }
        flattenedMapNode.forEach(
                (k, v) -> System.out.println(k + " => " + v));
    }
}
