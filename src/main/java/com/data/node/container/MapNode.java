package com.data.node.container;

import com.data.node.Node;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapNode extends ContainerNode<MapNode> {

    private final Map<String, Node> childrens;

    public MapNode(){
        childrens = new LinkedHashMap<>();
    }

    public MapNode(final Map<String, Node> childrens) {
        this.childrens = childrens;
    }

    public Node set(final String fieldName, final Node value) {
        this.childrens.put(fieldName, value);
        return this;
    }

    public Iterator<Map.Entry<String, Node>> getFieldNames() {
        return this.childrens.entrySet().iterator();
    }

    public boolean isMap(){
        return true;
    }
}
