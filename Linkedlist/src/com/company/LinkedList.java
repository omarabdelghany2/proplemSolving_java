package com.company;

public class LinkedList {
    private ListNode head=null;

    public void print(){
        ListNode i=head;
        while(i!=null){
            System.out.print(i.value);
            i=i.next;
        }
    }
    public void add(char v,int index){
        ListNode newNode=new ListNode(v);
        if(index==0){
            newNode.next=head;
            head=newNode;

        }
        else{
            ListNode i=head;

            for(int j=0;j<index-1;j++){
                i=i.next;
             }
            newNode.next=i.next;
            i.next=newNode;
             }
    }
    public void remove(int index){
        ListNode i=head;
        for(int j=0;j<index;j++){
            i=i.next;
        }
        i.next=(i.next).next;
    }
}
