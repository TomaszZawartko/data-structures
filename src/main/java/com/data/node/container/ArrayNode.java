package com.data.node.container;

import com.data.node.Node;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayNode extends ContainerNode<ArrayNode> {
    private final List<Node> childrens;

    public ArrayNode(){
        childrens = new LinkedList<>();
    }

    public ArrayNode add(final Node node) {
        this.childrens.add(node);
        return this;
    }

    public Iterator<Node> elements(){
        return this.childrens.iterator();
    }

    @Override
    public boolean isArray(){
        return true;
    }
}
