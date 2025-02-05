package com.cydeo.stack;

import java.util.*;
import java.util.stream.Collectors;

public class StackAssignment {
//    public static ArrayList<Integer> sunsetViews(int[] buildings, String direction){
//        Deque<Integer> buildingIndices_Stack=new LinkedList<>();
//        ArrayList<Integer> result=new ArrayList<>();
//        // if direction is East
//        if(direction.replaceAll("\\s","").equalsIgnoreCase("East")){
//            int max_Height=0;
//            int current_Height=0;
//
//            for (int i = 0; i < buildings.length; i++) {
//                if(i==0){
//                    buildingIndices_Stack.push(i);
//                    max_Height=buildings[0];
//                    current_Height=max_Height;
//                }
//                else{
//                    if(buildings[i]>=max_Height){
//                        buildingIndices_Stack.clear();
//                        buildingIndices_Stack.push(i);
//                        max_Height=buildings[i];
//                        current_Height=max_Height;
//                    }
//                    else if(buildings[i]>=current_Height && buildings[i]< max_Height){
//                        buildingIndices_Stack.pop();
//                        buildingIndices_Stack.push(i);
//                        current_Height=buildings[i];
//                    }
//
//                }
//            }
//            for(Integer eachIndices: buildingIndices_Stack){
//                result.add(eachIndices);
//            }
//        }
//        return result;
//    }

    public static ArrayList<Integer> sunsetViews(int[] buildings, String direction){
        Deque<Integer> buildingIndices_Stack=new LinkedList<>();
//        buildingIndices_Stack.push(buildings[0]);
        Integer max_Height=buildings[0];
        Integer current_Height=max_Height;
        ArrayList<Integer> result=new ArrayList<>();
        // if direction is East
        if(direction.replaceAll("\\s","").equalsIgnoreCase("East")){


            for (int i = 0; i < buildings.length; i++) {
               // if build[i] >= max
                 if(buildings[i]>=max_Height){
                     buildingIndices_Stack.clear();
                     buildingIndices_Stack.push(i);
                     max_Height=current_Height=buildings[buildingIndices_Stack.peek()];
                 }
                 // if build[i] <  buildings[buildingIndices_Stack.peek()])
                else if(buildings[i]< current_Height){
                   buildingIndices_Stack.push(i);
                   current_Height=buildings[buildingIndices_Stack.peek()];
               }
                //if build[i] ==  buildings[buildingIndices_Stack.peek()])
                 else if (buildings[i]==current_Height) {
                      buildingIndices_Stack.pop();
                      buildingIndices_Stack.push(i);
                      current_Height=buildings[buildingIndices_Stack.peek()];
                 }

                 // if build[i] > buildings[buildingIndices_Stack.peek()]) and < max_Height
                else if(buildings[i]>=current_Height && buildings[i] < max_Height){
                     while (buildings[i]>=current_Height){
                         buildingIndices_Stack.pop();
                         current_Height=buildings[buildingIndices_Stack.peek()];
                     }
                     buildingIndices_Stack.push(i);
                 }
            }
             // deque would do stack structure and pop element as LIFO
            while(!buildingIndices_Stack.isEmpty()){
                result.add(0,buildingIndices_Stack.pop());
            }
        }
        return result;
    }
    public static void main(String[] args) {
//        System.out.println(sunsetViews(new int[]{3,5,8},"East"));
        System.out.println(sunsetViews(new int[]{3,5,4,4,3,1,3,2},"East"));
//        System.out.println(sunsetViews(new int[]{1,5,3,7,10},"East"));
//        System.out.println(sunsetViews(new int[]{10,9,8,7,6,5,4,3,2,1},"East"));
    }
}
