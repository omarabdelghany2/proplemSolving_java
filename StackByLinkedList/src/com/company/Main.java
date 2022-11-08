package com.company;

import sun.awt.image.ImageWatched;

public class Main {

    public static void main(String[] args) {

        StackByLinkedList myStack = new StackByLinkedList();
        myStack.push(1);
        myStack.push(2);
        myStack.push(5);
        myStack.push(6);
        System.out.println(myStack.getPeak().getValue());




    }
}
