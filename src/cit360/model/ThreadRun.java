/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360.model;

import java.util.*;

/**
 *
 * @author SexyMama
 */
public class ThreadRun implements Runnable {

    String name;
    int time;
    Random r = new Random();

    public ThreadRun(String x) {
        name = x;
        //random time between 0 and approx 1 second
        time = r.nextInt(999);
    }

    public void run() {
        try {
            System.out.printf("%s is sleeping for %d\n", name, time);
            Thread.sleep(time);
            System.out.printf("%s is done\n", name);
        } catch (Exception e) {

        }
    }
}
