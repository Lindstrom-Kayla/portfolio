/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360.view;

import java.util.Map;
/**
 *
 * @author SexyMama
 */
public class HashMapView {
    public static void main(String[] args) {
        Map chocolate = (Map) new HashMapView();
        //My chocolate
        chocolate.put("KitKat", 2);
        chocolate.put("Snickers", 0);
        chocolate.put("PayDay", 4);
        chocolate.put("MilkDuds", 5);
        chocolate.put("Twix", 2);
        
        System.out.println("My chocolate: " + chocolate.size());
        
        //Iterate over my chocolate!
        for(Object key: chocolate.keySet())
            System.out.println(key + " - " + chocolate.get(key));
        System.out.println();
        
        String searchKey = "Twix";
        if(chocolate.containsKey(searchKey))
            System.out.println("My total " + chocolate.get(searchKey) + " " + searchKey + " chocolate!\n");
         
        //Clear my chocolate!
        chocolate.clear();
        
        //Make equal to 0
        System.out.println("Amount of Chocolate: " + chocolate.size());
    }
}
