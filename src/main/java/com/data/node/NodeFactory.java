package com.data.node;

import com.data.node.value.DoubleNode;
import com.data.node.value.IntegerNode;
import com.data.node.value.NumericNode;
import com.data.node.value.TextNode;
import com.data.node.value.ValueNode;

public class NodeFactory {



    public static NumericNode integerNode(int value) {
        return new IntegerNode(value);
    }

    public static NumericNode doubleNode(double value) {
        return new DoubleNode(value);
    }

    public static ValueNode textNode(String value) {
        return new TextNode(value);
    }
}
