package com.cydeo.stack;

import java.util.*;
import java.util.stream.Collectors;

public class StackApp {
    public static void main(String[] args) {
        MyStack<Integer> myStack=new MyStack<>();

        for(int i=0; i<10; i++){
            myStack.push(i);
        }
        System.out.println(myStack);
        System.out.println(myStack.peek());
        System.out.println(myStack.pop());
        System.out.println(myStack.peek());


//        List<Integer> list=new LinkedList<>();
//        for (int i = 0; i < 10; i++) {
//            list.add(i);
//
//        }
//        System.out.println(list);
//        list.clear();
//        System.out.println(list);
//        System.out.println(list.size());
//
//        List<Integer> linkedList=new LinkedList<>();
//        for (int i = 0; i < 10; i++) {
//            linkedList.add(i);
//        }
//        System.out.println(linkedList.size());
//       Integer result= linkedList.remove(9);
//        linkedList.remove(8);
//        linkedList.remove(7);
//        System.out.println(result);
//        System.out.println(linkedList);
//        System.out.println(linkedList.size());

//        Stack<Integer> stack=new Stack<>();
//        for (int i = 0; i < 10; i++) {
//            stack.push(i);
//        }
//        System.out.println("Printing stack: "+stack.firstElement());
//        System.out.println("Reverse stack with stream");
////        Collections.reverse(stack);
//        List<Integer> reversedList= stack.stream().toList();
////        while (!reversedList.isEmpty()){
////            System.out.println("Popping stack: "+stack.pop());
////        }
//        System.out.println(reversedList.get(0));

        System.out.println("================================================================================");

        Deque<Integer> dStack=new LinkedList<>();
        for(int i=0; i<10; i++){
            dStack.push(i);
        }
        System.out.println("Printing dStack: "+dStack);
        List<Integer> reverseList=dStack.stream().toList();
        System.out.println("Before reversing List: "+reverseList);
        // Reverse the list explicitly
        System.out.println("After reversing List: "+reverseList.stream()
                .collect( Collectors.collectingAndThen(Collectors.toList(),list->{
                    Collections.reverse(list);
                    return list;
                })));

        while (!dStack.isEmpty()){
            System.out.println("Popping dStack: "+dStack.pop());
        }
    }
}
