/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360.model;

import java.util.Scanner;

/**
 *
 * @author SexyMama
 */
public class EnterName {

    String enterName;
    String UserName = enterName;

    public String getName(String name) {

        enterName = name;
        //get name one and two
        //System.out.println("Enter Name:");
        //Scanner inputFromUser = new Scanner(System.in);
        //name = inputFromUser.nextLine();
        //System.out.println("\nThank you " + name + "!");
        return name;
    }

    public String getEnterName() {
        return enterName;
    }

    public void setEnterName(String enterName) {
        this.enterName = enterName;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

}
