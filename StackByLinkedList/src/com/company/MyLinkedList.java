package com.company;

import java.util.LinkedList;

public class MyLinkedList<I extends Number> {
    private Node head=null;

    public Node getRecentNode() {
        return recentNode;
    }

    private Node recentNode=null;

    public void print() {
        Node i=head;
        while (i != null) {
            System.out.println(i.getValue());
            i = i.next;
        }
    }
        public void add(int value,int index){
            Node newNode=new Node(value);
            this.recentNode=newNode;
            Node i=head;
            if(index==0){
                newNode.next=head;
                head=newNode;
            }
            else{
            for(int j=0;j<index-1;j++){
                i = i.next;
            }
            newNode.next=i.next;
            i.next=newNode;
        }
            }
        public int remove(int index){
        Node i=head;
        int outPut;
        if(index==0){
            outPut=head.getValue();
            head=head.next;
            this.recentNode=head;
        }
        else {
            for (int j = 0; j < index - 1; j++) {
                i = i.next;
            }
            outPut=i.next.getValue();
            i.next=i.next.next;
            this.recentNode=i;
        }

        return (outPut);

            LinkedList<Integer> myList = new LinkedList<>();
            myList.
        }
//      public int top(int topIndex){
//            Node i=head;
//            int outPut;
//            if(topIndex==0){
//                outPut=head.getValue();
//            }
//            else {
//                for (int j = 0; j < topIndex-1; j++) {
//                    i = i.next;
//                }
//                outPut=i.getValue();
//            }
//
//            return (outPut);
//
//

    /*
    * public void add(Node newNode){}
    * public void remove(Node node){}
    * public void addByIndex(int index, Node node){}
    * public void removeByIndex(int index){}
    * public boolean isEmpty(){}
    * */
}
