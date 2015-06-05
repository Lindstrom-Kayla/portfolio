/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360.control;

import cit360.view.WelcomePageView;
import java.util.Scanner;

/**
 *
 * @author SexyMama
 */
public class CIT360 {

    private static final Scanner inFile = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        WelcomePageView welcomePageView = new WelcomePageView();

        try {
            java.awt.EventQueue.invokeLater(() -> {
                new WelcomePageView().setVisible(true);
            });

        } catch (Throwable ex) {
            System.out.println(ex.getMessage());
        } finally {
            if (welcomePageView != null) {
                welcomePageView.dispose();
            }
        }
        /*String nameOne = null;
         String UserNames[] = {nameOne};

         //get name
         System.out.println("Enter name one:");
         Scanner inputFromUser = new Scanner(System.in);
         nameOne = inputFromUser.nextLine();
         System.out.println("\nThank you " + nameOne + "!");*/
    }

}
