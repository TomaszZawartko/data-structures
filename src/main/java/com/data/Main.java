package com.data;

import com.data.node.container.ArrayNode;
import com.data.node.container.MapNode;
import com.data.node.Node;
import com.data.node.NodeFactory;

import java.util.Map;

public class Main {
    public static void main(String[] args) {

        final Node book1Name = NodeFactory.textNode("book1");
        final Node book1Price = NodeFactory.integerNode(10);

        final Node book2Name = NodeFactory.textNode("book2");
        final Node book2Price = NodeFactory.doubleNode(23.54);

        final Node book1 = new MapNode(Map.of("bookName", book1Name, "bookPrice", book1Price));
        final Node book2 = new MapNode(Map.of("bookName", book2Name, "bookPrice", book2Price));
        final ArrayNode books = new ArrayNode();
        books.add(book1);
        books.add(book2);

        final Node userName = NodeFactory.textNode("Tom");
        final Node userAge = NodeFactory.integerNode(25);
        final Node userHeight = NodeFactory.doubleNode(1.7);

        final MapNode root = new MapNode();
        root.set("name", userName);
        root.set("age", userAge);
        root.set("books", books);
        root.set("height", userHeight);

        final Printer printer = new Printer(root);
        printer.print();
    }
}
