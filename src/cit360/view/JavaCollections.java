/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360.view;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 *
 * @author SexyMama
 */
public class JavaCollections {

    public static void main(String[] args) {
        
//----------------Map---------------------------
        Map chocolate = (Map) new JavaCollections();
        //My chocolate
        chocolate.put("KitKat", 2);
        chocolate.put("Snickers", 0);
        chocolate.put("PayDay", 4);
        chocolate.put("MilkDuds", 5);
        chocolate.put("Twix", 2);

        System.out.println("My chocolate: " + chocolate.size());

        //Iterate over my chocolate!
        for (Object key : chocolate.keySet()) {
            System.out.println(key + " - " + chocolate.get(key));
        }
        System.out.println();

        String searchKey = "Twix";
        if (chocolate.containsKey(searchKey)) {
            System.out.println("My total " + chocolate.get(searchKey) + " " + searchKey + " chocolate!\n");
        }

        //Clear my chocolate!
        chocolate.clear();

        //Make equal to 0
        System.out.println("Amount of Chocolate: " + chocolate.size());

        
//-------------------------List------------------------------
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        //Adding
        numbers.add(30);
        numbers.add(20);
        numbers.add(50);

        //Retrieving
        System.out.println(numbers.get(0));

        System.out.println("\nIteration #1: ");
        //Indexed for loop iteration
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        //Removing items (careful)
        numbers.remove(numbers.size() - 1);

        //This is VERY slow
        numbers.remove(0);

        System.out.println("\nIteration #2: ");
        for (Integer value : numbers) {
            System.out.println(value);
        }

        //List interface...
        List<String> values = new ArrayList<String>();
        
       
//------------------------Set-----------------------------
        HashSet<String> name = new HashSet<String>();
        name.add("Kayla");
        name.add("Erik");
        name.add("Emmit");
        name.add("Unknown");
        
        //remove name Kayla
        name.remove(0);
        Iterator<String> itr = name.iterator();
        
        while(itr.hasNext())
            System.out.println(itr.next());
    }
}
