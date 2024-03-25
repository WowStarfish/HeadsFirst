package com.company;

import java.util.*;

public class ArrayListLoopExampleSimulator {
    public static void main(String[] args) {
        // initialize ArrayList
        ArrayList<Integer> al = new ArrayList<>();
        // add elements to ArrayList object
        al.add(3);
        al.add(17);
        al.add(6);
        al.add(9);
        al.add(7);
        System.out.println("Using Advanced For Loop");
        // printing ArrayList
        for (Integer num : al) {
            System.out.println(num);
        }

        //Converting a List to an Array
        Integer[] nums = new Integer[al.size()];
        al.toArray(nums);

        System.out.println("Values from converting list to an array: ");
        for(int num : nums){
            System.out.println(num);
        }

        //Iterating an HashSet
        Set<Integer> sl = new HashSet<>();
        sl.add(1);
        sl.add(3);
        sl.add(5);
        sl.add(7);
        sl.add(9);
        //for each loop
        System.out.println("Set for each loop: ");
        for(int num : sl){
            System.out.println(num);
        }

        //Use of iterator
        // Get the iterator
        System.out.println("Set use of iterator: ");
        for (Integer integer : sl) {
            System.out.println(integer);
        }

        //HashSetValueExistsOrNot
        System.out.println("hashset contains value five : " + sl.contains(5));
        System.out.println("hashset contains value eleven : " + sl.contains(11));

        Map<String, String> aMap = new HashMap<>();
        List<Integer>aList = new ArrayList<>();
        aList.add(2);
        aList.add(4);
        aList.add(6);
        aList.add(8);
        aList.add(10);

        //ListFromArray
        List <Integer> listFromArray = Arrays.asList(nums);
        System.out.println("Values after converting an array to a List");
        System.out.println(listFromArray);

        //Size of an array
        System.out.println("Array's size: " + listFromArray.size());

        //Size of an array
        System.out.println("Is the array empty? " + listFromArray.isEmpty());

        Map<Integer,String>map1 = new HashMap<>();
        map1.put(1,"a");
        map1.put(2,"b");
        map1.put(3,"c");
        map1.put(4,"d");

        //Iterating through a map
        System.out.println("Iterating over a map using keySet");
        Set<Integer>map1Keys = map1.keySet();
        for(int map1Key: map1Keys){
            System.out.print(map1Key);
            System.out.println(map1.get(map1Key));
        }

        System.out.println("Iterating over a map using lambda");
        map1.forEach((k,v)-> System.out.println("Key : "+k +"   Value : "+ v));

        //Iterating with entrySet
        Set<Map.Entry<Integer, String>> entrySet = map1.entrySet();

        for(var entry : entrySet)
        {
            System.out.println("Using entrySet: Key : "+entry.getKey()+"   Value : "+entry.getValue());
        }

        Iterator keySetIterator = map1.keySet().iterator();

        while (keySetIterator.hasNext())
        {
            int key = (int) keySetIterator.next();

            System.out.println("Use of Key : "+key+"   Value : "+map1.get(key));
        }

    }
}
