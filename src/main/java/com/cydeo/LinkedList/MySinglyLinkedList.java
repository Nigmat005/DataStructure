package com.cydeo.LinkedList;


import com.cydeo.LinkedList.CustomeExceptions.ListEmptyException;
import com.cydeo.LinkedList.Enums.ExceptionsEnums;

public class MySinglyLinkedList {
    /*
    Address of Head
    Address of tail
    Size
    Method like add,delete,indexOf
     */

    Node head;
    Node tail;
    int size=0;

    boolean isEmpty(){
        return head==null;
    }
    void add(int data){
        // create new Node object from data
        Node node=new Node(data);
        // make node assign to head and tail if head is null, meaning no node actually added.
        if(isEmpty()){
            head=tail=node; // here, both head.next() and tail.next() will point to null   head,tail==> null
        }
        // if head is not null, then make tail.next=node; by doing so will connect tp next node. (Always remember to connect to next node using tail.next and make tail move to next node)
        else{
            // if there is only one node added, by using tail.next()=node, we can make both head.next() and tail.next() point to new node, but after that tail should move to
            // that node so that tail.next() would be null, then repeat all procedure.

            tail.next=node; // make head.next also update
            tail=node;  // tail.next() would be null again
        }
        size++;

    }


     void add(int index, Node node){
        if(isEmpty()){
            try{
                throw new ListEmptyException(ExceptionsEnums.EMPTY_LIST);
            } catch (Exception e) {
                System.out.println("Exception Caused: "+e.getMessage());
            }
        }

        Node current=head;
        Node prev=head;
        if(index==0)
            addToFirst(node);
        else{
            while (current!=null){
                if(indexOf(current)==index){
                    prev.next=node;
                    node.next=current;
                    size++;
                    break;
                }
                prev=current;
                current=current.next;
            }
        }






    }
    void addToFirst(Node node) {
        if (isEmpty()) {
            head=tail=node;
            return;
        }
        else{
            Node current=head;
            head=node;
            head.next=current;
        }
        size++;
    }


    void printNode(){
        Node current=head;
        while (current!=null){
            System.out.print(current.id+"=>"+"\t");
            current=current.next;
        }
        System.out.print("null");
    }

    void prettyPrint(){
        Node current=head;
        while (current!=null){
            System.out.println(current.id+"=>");
            current=current.next;
        }
        System.out.println("null");
    }

    void deleteNode(int id){
        if(isEmpty()){
            try{
                throw new ListEmptyException(ExceptionsEnums.EMPTY_LIST);
            } catch (Exception e) {
                System.out.println("Exception Caused: "+e.getMessage());
            }
        }


        Node current=head;
        Node prev=head;

        while (current!=null){

            // if there is a match
            if(id == current.id){
                // => case 1: delete head,
                if(current==head){
                    head=current.next;
                    prev=head;
                    current.next=null;
                    current=head;
//                    current.next=null;  worked same
//                    current=null;       worked same

                }

                // case 2: delete tail
                else if(current==tail){
                     tail=prev;
                     tail.next=null;
                     // prev.next=null; worked same
                }

                // case 3: delete middle,
                else {
                   prev.next=current.next;
                   current.next=null; // Current will be eligible for GC and connection will be broken
                   current=prev.next;  // without this line, current will still be same current that already lost connection with both prev and its next node
                    System.out.println("This is current "+current.id);
                }
                size--;
            }
            prev=current;
            current=current.next;
        }





    }
    int indexOf(int id) {
        if (isEmpty()) {
            try {
                throw new ListEmptyException(ExceptionsEnums.EMPTY_LIST);
            } catch (Exception e) {
                System.out.println("Exception Caused: " + e.getMessage());
            }
            return -1;
        }

        // Iterate thru the list
        // Always make current head to make sure it starts with head
        Node current=head;
        int pos=0;
        while (current!=null){
            if(current.id==id)
                return pos;
            pos++;
            current=current.next;
        }
        return -1;
    }


    int indexOf(Node node) {
        if (isEmpty()) {
            try {
                throw new ListEmptyException(ExceptionsEnums.EMPTY_LIST);
            } catch (Exception e) {
                System.out.println("Exception Caused: " + e.getMessage());
            }
            return -1;
        }

        // Iterate thru the list
        // Always make current head to make sure it starts with head
        Node current=head;
        int pos=0;
        while (current!=null){
            if(current==node)
                return pos;
            pos++;
            current=current.next;
        }
        return -1;
    }

    int size(){
        return size;
    }


    Node getNodeAtIndexOf(int index){
        Node current=head;
        if(index>this.size()-1){
            return null;
           // throw new IndexOutOfBoundsException();
            }
        else{
                if(index==0)
                    return head;
                else if(index==size-1)
                    return tail;
                else{
                    while(index > 0) {
                        current = current.next;
                        index--;
                    }
                    return current;
                }
            }
        }

    // HomeWork Part
    // assume element is already in linked list
    int getKthElement(int k){
        int slowPointer=0;
        int fastPointer=k;
        if(k>=1){
            while(this.getNodeAtIndexOf(fastPointer)!=null){
                slowPointer++;
                fastPointer++;
            }
            return this.getNodeAtIndexOf(slowPointer).id;
        }
        return -1;
    }

    int getKthItemFromLast(int k){
       Node slowNode=head;
       Node fastNode=head;
       // first make sure the smallest item we can get from last is (something like 1, 2, 3... can not get 0th item from last, also k should be less than size otherwise fastNode would be
        // pointing null already even before we try to locate it.)
       if(k>0 && k<this.size()){

           // need to locate what kth node would be for both slow and fast node.
           for(int i=k; i>0;i--){
               fastNode=fastNode.next;
           }
           // then need to use that fastNode to traverse till fastNode reaches null
           while(fastNode!=null){
              slowNode=slowNode.next;
              fastNode=fastNode.next;
           }
           return slowNode.id;
       }
       return -1;
    }



}
