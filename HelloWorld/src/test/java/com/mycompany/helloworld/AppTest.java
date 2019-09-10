/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.helloworld;

import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author jaria
 */
public class AppTest {
    
    public AppTest() {
    }

    /**
     * Test of getWho method, of class App.
     */
    @org.junit.Test
    public void testGetWho() {
        System.out.println("getWho");
        App instance = new App();
        String expResult = "World";
        String result = instance.getWho();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of nonDefaultgetWho method, of class App.
     */
    public void testNonDefaultWho() {
        System.out.println("NonDefaultWho");
        App instance = new App();
        String expResult = "not " + instance.getWho();
        instance.setWho(expResult);
        String result = instance.getWho();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    

    /**
     * Test of setWho method, of class App.
     */
    @org.junit.Test
    public void testSetWho() {
        System.out.println("setWho");
        String string = "Bjarne";
        App instance = new App();
        instance.setWho(string);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getGreeting method, of class App.
     */
    @org.junit.Test
    public void testGetGreeting() {
        System.out.println("getGreeting");
        App instance = new App();
        String expResult = "Hello";
        String result = instance.getGreeting();
        assertEquals(expResult, result);
    }

    /**
     * Test of setGreeting method, of class App.
     */
    @org.junit.Test
    public void testSetGreeting() {
        System.out.println("setGreeting");
        String greeting = "Jariah";
        App instance = new App();
        instance.setGreeting(greeting);
        assertEquals(greeting, instance.getGreeting());
    }

    /**
     * Test of main method, of class App.
     */
    @org.junit.Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        App.main(args);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
