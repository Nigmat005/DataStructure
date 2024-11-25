package LinkedList;

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

    }
}
