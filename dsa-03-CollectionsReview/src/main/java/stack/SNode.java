package com.cydeo.stack;

public class SNode<T> {
    T value;
    SNode<T> next;
    public SNode(T t){
        this.value=t;
    }

    public SNode() {
    }
}
