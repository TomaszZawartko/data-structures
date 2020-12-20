package com.data.node.value;

public class IntegerNode extends NumericNode {
    private final int value;

    public IntegerNode(final int value) {
        this.value = value;
    }

    @Override
    public boolean isInteger(){
        return true;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
