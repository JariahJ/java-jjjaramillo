/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author jaria
 */
public class queueAdditionsTest {

    /**
     * Test of read method, of class queueAdditions.
     */
    @Test
    public void testRead() {
        System.out.println("read");
        queueAdditions instance = new queueAdditions();
        instance.read();
        int expected = instance.data.size();
        assertEquals(expected, 5000);
    }

    @Test
    public void testReadFail() {
        System.out.println("read");
        queueAdditions instance = new queueAdditions();
        instance.read();
        int expected = instance.data.size();
        assertNotEquals(expected, 0);
    }

    /**
     * Test of getNumberFromList method, of class queueAdditions.
     */
    @Test
    public void testGetNumberFromList() {
        System.out.println("getNumberFromList");
        queueAdditions instance = new queueAdditions();
        int expResult = 0;
        instance.data.add(0);
        int result = instance.getNumberFromList();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of addToQueue method, of class queueAdditions.
     */
    @Test
    public void testAddToQueue() {
        System.out.println("addToQueue");
        int num = 0;
        queueAdditions instance = new queueAdditions();
        int expected = instance.q.size()+1;
        instance.addToQueue(num);
        assertEquals(expected, instance.q.size());
    }

}
