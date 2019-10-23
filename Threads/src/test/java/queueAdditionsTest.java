/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author jaria
 */
public class queueAdditionsTest {
    
    /**
     * Test of read method, of class queueAdditions.
     */
    @org.junit.jupiter.api.Test
    public void testRead() {
        System.out.println("read");
        queueAdditions instance = new queueAdditions();
        instance.read();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumberFromList method, of class queueAdditions.
     */
    @org.junit.jupiter.api.Test
    public void testGetNumberFromList() {
        System.out.println("getNumberFromList");
        queueAdditions instance = new queueAdditions();
        int expResult = 0;
        int result = instance.getNumberFromList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addToQueue method, of class queueAdditions.
     */
    @org.junit.jupiter.api.Test
    public void testAddToQueue() {
        System.out.println("addToQueue");
        int num = 0;
        queueAdditions instance = new queueAdditions();
        instance.addToQueue(num);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of parallelAdd method, of class queueAdditions.
     */
    @org.junit.jupiter.api.Test
    public void testParallelAdd_int() {
        System.out.println("parallelAdd");
        int threads = 0;
        queueAdditions instance = new queueAdditions();
        instance.parallelAdd(threads);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of parallelAdd method, of class queueAdditions.
     */
    @org.junit.jupiter.api.Test
    public void testParallelAdd_0args() {
        System.out.println("parallelAdd");
        queueAdditions instance = new queueAdditions();
        instance.parallelAdd();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class queueAdditions.
     */
    @org.junit.jupiter.api.Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        queueAdditions.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
