/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360.model;

/**
 *
 * @author SexyMama
 */
public class Thread {

    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadRun("one"));
        Thread t2 = new Thread(new ThreadRun("two"));
        Thread t3 = new Thread(new ThreadRun("three"));
        Thread t4 = new Thread(new ThreadRun("four"));

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }

    static void sleep(int time) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Thread(ThreadRun threadRun) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void start() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
