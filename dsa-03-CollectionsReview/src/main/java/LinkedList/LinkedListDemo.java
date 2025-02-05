package LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {

        Node node1=new Node(1);
        Node node2=new Node(2);
        Node node3=new Node(3);
        Node node4=new Node(4);

        System.out.println(node1);
        System.out.println("Before linking with each other the address in each node is: "+node1.next);

        // Link each node to each other
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;

        System.out.println("After linking with each other the address in each node is: "+node1.next);

        Node current;
        Node head=node1;
        current=head;

        while (current!=null){
            System.out.println("Id of node is: "+current.id);
            current=current.next;
        }
    }
}
