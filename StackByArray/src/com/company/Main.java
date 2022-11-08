package com.company;

import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        Stack myStack=new Stack(10);
        myStack.push("10");
        myStack.push("20");
        myStack.push("30");
        System.out.println(myStack.top());
        String m=myStack.pop();
        System.out.println(myStack.top());


    }
}
