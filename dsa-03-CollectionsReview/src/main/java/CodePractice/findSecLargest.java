package CodePractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class findSecLargest {
    // find second largest item from an Array

    public static int secondLargestItem_Sorted(int[] input){
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        // first array needs to be sort
        Arrays.sort(input);
        for (int i=0;i<input.length;i++){
            if(input[i]>largest){
                secondLargest=largest;
                largest=input[i];
            }
        }
        return secondLargest;
    }

    public static int secondLargestItem(int[] input){
        if(input==null || input.length==1)
            throw new ArithmeticException("Given array must not be null and at least have 2 elements");

        else {
            int largest=Integer.MIN_VALUE;
            int secondLargest=Integer.MIN_VALUE;

            for (int j : input) {
                if (j > largest) {
                    secondLargest = largest;
                    largest = j;
                } else if (j < largest && j > secondLargest) {
                    secondLargest = j;
                }
            }
            return secondLargest;
        }

    }


    public static void main(String[] args) {
        int[] input=new int[]{1,1,4,2,6,9,12,12,7,10,10};
        System.out.println(secondLargestItem_Sorted(input));
        System.out.println(secondLargestItem(input));
//        System.out.println(secondLargestItem(new int[]{0}));
    }
}
