package com.company;

public class Stack {
    private int topIndex=-1;
    private String [] arr;
    public Stack(int sizeOfStack) {
        arr=new String[sizeOfStack];
    }


    public void push(String inPut){
        topIndex++;
        this.arr[topIndex]=inPut;
    }
    public String pop(){
        String outPut=arr[topIndex];
        topIndex--;
        return (outPut);
    }
    public String top(){
        return (arr[topIndex]);
    }
}
