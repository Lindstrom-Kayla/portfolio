/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360.model;

import java.io.*;
import java.net.*;

/**
 *
 * @author SexyMama
 */
public class SOK_1_Client {
    
    public static void main(String[] args) throws Exception {
        SOK_1_Client CLIENT = new SOK_1_Client();
        CLIENT.run();
    }

    public void run() throws Exception {
        //Sock to connect to server with port number
        Socket SOCK = new Socket("localhost", 444);
        //From client to server
        PrintStream PS = new PrintStream(SOCK.getOutputStream());
        PS.println("Hello to SERVER from CLIENT");

        //Listening from the server
        InputStreamReader IR = new InputStreamReader(SOCK.getInputStream());
        BufferedReader BR = new BufferedReader(IR);

        //Print message
        String MESSAGE = BR.readLine();
        System.out.println(MESSAGE);
    }
}
