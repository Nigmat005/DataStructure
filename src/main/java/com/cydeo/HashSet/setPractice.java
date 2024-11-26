package com.cydeo.HashSet;

import java.util.HashSet;
import java.util.Locale;

public class setPractice {
    public static String findFirstRep(String input){
        HashSet<String> hashSet=new HashSet<>();
        for(String eachString: input.split("")){
            if(hashSet.add(eachString.toLowerCase(Locale.ENGLISH))==false)
               return eachString;
        }
        return null;
    }

//    public static Character findFirstRep(String input){
//        HashSet<Character> hashSet=new HashSet<>();
//        for (Character eachCharacter: input.toCharArray())
//            if(!hashSet.add(eachCharacter))
//                return eachCharacter;
//        return null;
//    }
    public static void main(String[] args) {
        HashSet<Integer> hashSet=new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        System.out.println(hashSet);

        System.out.println(hashSet.add(2));

        System.out.println(findFirstRep("JVva Developer"));
    }
}
