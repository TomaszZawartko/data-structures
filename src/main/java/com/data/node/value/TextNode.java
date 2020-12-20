package com.data.node.value;

public class TextNode extends ValueNode {
    private final String value;
    public TextNode(String value) {
        this.value = value;
    }

    public boolean isString(){
        return true;
    }

    @Override
    public String toString() {
        return value;
    }
}
