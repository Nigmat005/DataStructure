package Map;

import java.util.HashMap;
import java.util.Map;

public class MapReview {
    //find first non-repeating in String

    public static String findFirst_Repeating(String input){

        Map<String,Integer> map=new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            if(!map.containsKey(input.toLowerCase().charAt(i)+"")){
                map.put(input.toLowerCase().charAt(i)+"",i);
            }
            else{
                return input.charAt(map.get(input.charAt(i)+""))+"";
            }
        }
        return null;
    }

    public static String findFirstNon_Repeating(String input){
        Map<Character,Integer> map=new HashMap<>();
        int count=1;
        for(Character eachChar: input.toLowerCase().toCharArray()){
            if(!map.containsKey(eachChar)){
                map.put(eachChar,count);
            }
            else {
                map.put(eachChar,map.get(eachChar)+1);
            }
        }
        System.out.println(map);

        for(Character eachInMap: input.toLowerCase().toCharArray()){
            if(map.get(eachInMap)==1)
                return eachInMap.toString();
            break;
        }
        return null;
    }
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"sergiu");
        map.put(2,"Mases");
        map.put(3,"Mike");
        map.put(4,"David");
        map.put(5,"Jonathan");
        map.put(6,"Messi");
        map.put(7,"Ronaldo");
//        System.out.println(map);

//        for (Map.Entry<Integer,String> eachKey: map.entrySet()){
//            System.out.println("Key is: "+eachKey.getKey()+" Value is: "+eachKey.getValue());
//        }

        for (Integer eachKey : map.keySet()){
            System.out.println(eachKey+": "+map.get(eachKey));
        }


        System.out.println("=========================find first repeating Element ==============================");
        System.out.println(findFirst_Repeating("JAva"));
        System.out.println(findFirst_Repeating("Java Developer"));

        System.out.println("=========================find first Non_repeating Element ==============================");
        System.out.println(findFirstNon_Repeating("JAva"));
        System.out.println(findFirstNon_Repeating("Java Developer"));

    }


}
