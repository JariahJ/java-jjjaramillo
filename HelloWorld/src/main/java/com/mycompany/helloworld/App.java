/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.helloworld;

/**
 *
 * @author jaria
 */
public class App {
    
    public static void main(String [] args) throws Exception {
        App app = new App();
        app.run();
    }

    private void run() {
        String who = "World ";
        System.out.println("Hey" + who + "!"); 
    }
    
}
