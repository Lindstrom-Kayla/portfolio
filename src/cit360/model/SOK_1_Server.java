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
public class SOK_1_Server {

    public static void main(String[] args) throws Exception {
        SOK_1_Server SERVER = new SOK_1_Server();
        SERVER.run();
    }

    public void run() throws Exception {
        //My serversocket
        ServerSocket SRVSOCK = new ServerSocket(444);
        //My plain socket with accept method
        Socket SOCK = SRVSOCK.accept();
        InputStreamReader IR = new InputStreamReader(SOCK.getInputStream());
        BufferedReader BR = new BufferedReader(IR);

        //print message
        String MESSAGE = BR.readLine();
        System.out.println(MESSAGE);

        if (MESSAGE != null) {
            PrintStream PS = new PrintStream(SOCK.getOutputStream());
            PS.println("MESSAGE received");
        }
    }
}
