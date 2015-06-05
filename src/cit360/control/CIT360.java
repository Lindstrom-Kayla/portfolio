/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360.control;

import java.util.Scanner;

/**
 *
 * @author SexyMama
 */
public class CIT360 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String nameOne = null;
        String UserNames[] = {nameOne};

        //get name one and two
        System.out.println("Enter name one:");
        Scanner inputFromUser = new Scanner(System.in);
        nameOne = inputFromUser.nextLine();
        System.out.println("\nThank you " + nameOne + "!");

    }
    
}
