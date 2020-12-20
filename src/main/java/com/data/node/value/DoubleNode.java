package com.data.node.value;

public class DoubleNode extends NumericNode {
    private final double value;

    public DoubleNode(final double value) {
        this.value = value;
    }

    @Override
    public boolean isDouble(){
        return true;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
