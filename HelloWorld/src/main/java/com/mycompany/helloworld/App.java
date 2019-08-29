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
    
    private String who = "World";

    /**
     * Get the value of string
     *
     * @return the value of string
     */
    public String getWho() {
        return who;
    }

    /**
     * Set the value of string
     *
     * @param string new value of string
     */
    public void setWho(String string) {
        this.who = string;
    }

    
    private String greeting = "Hello";
    public String getGreeting(){
        return greeting;
    }
    public void setGreeting(String greeting){
        this.greeting = greeting;
    }
    public static void main(String [] args) throws Exception {
        App app = new App();
        app.run();
    }

    private void run() {
        
        
        String who = "World";
        System.out.println(getGreeting()+ ' ' + getWho() + "!"); 
    }
    
}
