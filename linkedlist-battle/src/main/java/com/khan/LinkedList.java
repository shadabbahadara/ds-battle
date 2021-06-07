package com.khan;
public class LinkedList {
    private Node start;
   public LinkedList(){
        this.start=null;
    }
    //insertion linked list
    public void add(Node node){
        if(this.start==null){
            this.start=node;
        }
        else{
            Node ptr = this.start;
            while (ptr.next!=null){
                ptr = ptr.next;
            }
            ptr.next=node;
        }
    }

    // traverse linked list
    @Override
    public String toString() {
        StringBuilder list = new StringBuilder("[ ");
        Node ptr = this.start;
        while(ptr!=null){
            list.append(ptr.info).append(" ");
            ptr = ptr.next;
        }
        list.append("]");
    return list.toString();
    }
}


