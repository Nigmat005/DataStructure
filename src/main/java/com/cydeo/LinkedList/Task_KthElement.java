package com.cydeo.LinkedList;

public class Task_KthElement {
    public static void main(String[] args) {
        MySinglyLinkedList linkedList=new MySinglyLinkedList();

        // add 10 elements to linkedList
        for (int i = 0; i < 10; i++) {
            linkedList.add(i);
        }

        // check list
        System.out.println("Printing list");
        linkedList.prettyPrint();

        // get kth element from last
//        System.out.println("Getting 0th element from last");
//        System.out.println(linkedList.getKthElement(0));
//
//        System.out.println("Getting 5th element from last");
//        System.out.println(linkedList.getKthElement(5));
//
//        System.out.println("Getting 10th element from last");
//        System.out.println(linkedList.getKthElement(10));

        System.out.println("========================================== Trying With getKthItemFromLast");

        System.out.println("Size of list is: "+linkedList.size());
        System.out.println("Getting 0th element from last");
        System.out.println(linkedList.getKthItemFromLast(0));

        System.out.println("Getting 5th element from last");
        System.out.println(linkedList.getKthItemFromLast(5));

        System.out.println("Getting 10th element from last");
        System.out.println(linkedList.getKthItemFromLast(10));


        System.out.println("=========================================Test RemoveKth Element from lats");
        System.out.println("Before removing the element from kth element, the size is: "+linkedList.size());
        linkedList.prettyPrint();
        linkedList.removeKthItemFromLast(1);
        System.out.println("After removing the element from kth element, the size is: "+linkedList.size());
        linkedList.prettyPrint();
        linkedList.removeKthItemFromLast(15);
        linkedList.prettyPrint();
        System.out.println("After removing the element from kth element, the size is: "+linkedList.size());
    }
}
