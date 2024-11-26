package com.cydeo.LinkedList;

public class SinglyLinkedListApp {
    public static void main(String[] args) {
      MySinglyLinkedList myList=new MySinglyLinkedList();
        System.out.println(myList.isEmpty());

        myList.deleteNode(0);

        for (int i=0; i<10;i++){
          myList.add(i);
        }

        myList.printNode();

        System.out.println("Delete head");
        myList.deleteNode(0);
        myList.printNode();
        System.out.println("====================================");

        System.out.println("Delete tail");
        myList.deleteNode(9);
        myList.printNode();
        System.out.println("====================================");


        System.out.println("Delete middle");
        myList.deleteNode(5);
        myList.printNode();
        System.out.println("====================================");


      System.out.println("Index of 8 is: "+myList.indexOf(8));
      System.out.println("Size is: "+myList.size());

      System.out.println("\nBefore add node to head");
      myList.prettyPrint();
      System.out.println("Before add size is: "+myList.size());


      System.out.println("\nAfter add node to head");
      myList.addToFirst(new Node(15));
      myList.prettyPrint();
      System.out.println("After add size is: "+myList.size());



      System.out.println("\nTest add node in middle ======================================");
      MySinglyLinkedList myList2=new MySinglyLinkedList();
      for (int i=10; i<20;i++){
        myList2.add(i);
      }
      System.out.println("Check before adding a node in index of 5, id should be 15 as per sequence");
//      System.out.println(myList2.indexOf(15));
      myList2.prettyPrint();

      System.out.println("After adding a node in index of 5");
      myList2.add(5,new Node(50));
      myList2.prettyPrint();
      System.out.println("After add size is: "+myList2.size());

      System.out.println("Test add node in last");
      myList2.add(myList2.size()-1,new Node(100));
      System.out.println("After adding a node in last index");
      myList2.prettyPrint();

      System.out.println("Test add node in head");
      myList2.add(0,new Node(0));
      System.out.println("After adding a node in head");
      myList2.prettyPrint();


      System.out.println("Test getNode at specific index========================================");
      System.out.println("Id of node at first index is: ");
      System.out.println(myList2.getNodeAtIndexOf(0).id);
      System.out.println("Id of node at last index is: ");
      System.out.println(myList2.getNodeAtIndexOf(myList2.size()-1).id);
      System.out.println("Id of node at 5th index is: ");
      System.out.println(myList2.getNodeAtIndexOf(15).id);
    }
}
