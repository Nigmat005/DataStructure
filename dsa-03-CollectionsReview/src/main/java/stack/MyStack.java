package com.cydeo.stack;

import java.util.Random;
import java.util.Stack;

public class MyStack <T>{
    // create all stack methods here
    public SNode<T> bottom;
    public SNode<T> top;
    int size;

//    public MyStack(SNode<T> bottom, SNode<T> top) {
//        this.bottom = bottom;
//        this.top = top;
//    }

    int size(){
        return this.size;
    }

    boolean isEmpty(){
        return this.size()==0 || this.bottom==null;
    }

     void push(T value){
       SNode<T> sNode=new SNode<>(value);
        if(isEmpty()){
            this.bottom=this.top=sNode;
         }
        else{
            this.top.next=sNode; // will make bottom.next point to sNode as well
            this.top=sNode;
        }
        size++;
    }

    /**
     * @author Nigmat
     * This method will check if stack is null or empty
     * return only the value of the top element not removing
     * @return
     */
   public T peek(){
        if(isEmpty())
            throw new RuntimeException("Empty Stack");
        else {
            return this.top.value;
        }
    }

    /**
     * @author Nigmat
     * This method first returns the top value then removes the top node
     * @return T value of top
     */
    public T pop() {
        SNode<T> current = bottom;
        SNode<T> peekNode;
        if (isEmpty())
            throw new RuntimeException("Empty Stack");

        else if (bottom == top){
            peekNode=top;
            bottom = top = null;
        }
        else {
            while (current.next != top) {
                current = current.next;
            }
            peekNode=top;
            top = current;
            current.next = null;
        }
        size--;
        return peekNode.value;
    }

}
