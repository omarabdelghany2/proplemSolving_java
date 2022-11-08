package com.company;

public class StackByLinkedList {
    MyLinkedList<Number> myStack = new MyLinkedList<Number>();
    private int StackTop = 0;

    public Node getPeak() {
        return peak;
    }

    private Node peak=null;

    public void push(int value){
        myStack.add(value,StackTop);
        this.StackTop++;
        peak = myStack.getRecentNode();
    }

    public int pop(){
        int outPut = myStack.remove(StackTop-1);
        this.StackTop--;
        peak = myStack.getRecentNode();
        return (outPut);
    }
//    public int top(){
//        int outPut=myStack.top(StackTop);
//        return (outPut);
//    }
}
