package com.cydeo.stack;

import java.util.Deque;
import java.util.LinkedList;
import java.util.function.Predicate;

public class ExprBalanceCheck {
//   static Predicate<String> checkBalance=(String expr)->{
//
//        return expr.contains("\\s");
//    };
    public static boolean checkBalance(String expr){
      // Create a char stack with Deque or Stack class
        Deque<Character> stack=new LinkedList<>();
        // check expr is null, or it does not contain symbol we want
        if(expr==null || expr.isEmpty() || !(expr.contains("(") || expr.contains("[") || expr.contains("{")||expr.contains(")")||expr.contains("]")||expr.contains("}")))
            return false;
        // iterate over expr
        for(Character eachChar: expr.toCharArray()){
           // if eachChar is != ([{}]) then continue in for loop  need to use &&
            if(eachChar!='(' &&  eachChar!='[' && eachChar!='{' && eachChar!=')' && eachChar!=']' && eachChar!='}'){
               continue;
           }
            // if eachChar == != ([{}])
            else {
                // if eachChar == opening symbol like ===>'(' or '[' or'{'
                if (eachChar == '(' || eachChar == '[' || eachChar == '{') {
                    stack.push(eachChar);
                    continue;
                }
                if (stack.isEmpty())
                    return false;
                switch (eachChar) {
                    case ')' -> {
                        if (stack.pop() != '(')
                            return false;
                    }
                    case ']' -> {
                        if (stack.pop() != '[')
                            return false;
                    }
                    case '}' -> {
                        if (stack.pop() != '{')
                            return false;
                    }
                }
            }
         }// for loop ends

        //stack should be empty
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(ExprBalanceCheck.checkBalance("(a+b)"));
        System.out.println(ExprBalanceCheck.checkBalance("(a+b)+[{(c+d)}+({})]"));
        System.out.println(ExprBalanceCheck.checkBalance("(a+b)+[{(c+d)}+({)]"));
        System.out.println(ExprBalanceCheck.checkBalance("sfafsafalfhahfjki"));
        System.out.println(ExprBalanceCheck.checkBalance("sfafsafal()()}fjki"));
        System.out.println(ExprBalanceCheck.checkBalance("())(}"));
    }
}
