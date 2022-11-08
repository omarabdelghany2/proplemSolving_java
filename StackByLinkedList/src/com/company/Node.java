package com.company;

public class Node {
    public Node(int value) {
        this.value = value;
    }

    private int value;
    public Node next;
    public int getValue() {
        return value;
    }

}
