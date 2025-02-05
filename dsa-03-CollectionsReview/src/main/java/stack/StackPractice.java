package com.cydeo.stack;

import java.util.Arrays;
import java.util.Stack;

public class StackPractice {
    public static void main(String[] args) {
        Stack<Character> stack=new Stack<>();

        for(char eachChar: "Cydeo".toCharArray()){
            stack.push(eachChar);
        }
        System.out.println(stack);
        System.out.println("The size of stack is: "+stack.size());

        int size=stack.size();
        for(int i=0; i<size;i++){
            System.out.println(stack.pop());
        }
    }
}
