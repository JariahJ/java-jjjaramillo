/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jaria
 */
public class collectionTest {
    
    @Test
    public void testRun() {
        System.out.println("run");
        collection instance = new collection();
        String expResult = "uno";
        instance.kee = "one";
        instance.solve();
        String result = instance.translation;
        assertEquals(expResult, result);
    }
    
    
       @Test
    public void testRun2() {
        System.out.println("run");
        collection instance = new collection();
        String expResult = "dos";
        instance.kee = "two";
        instance.solve();
        String result = instance.translation;
        assertEquals(expResult, result);
    }
    
        @Test
    public void testRun3() {
        System.out.println("run");
        collection instance = new collection();
        String expResult = "tres";
        instance.kee = "three";
        instance.solve();
        String result = instance.translation;
        assertEquals(expResult, result);
    }

    /**
     * Test of done method, of class collection.
     */
    @Test
    public void testDone() {
        System.out.println("done");
        collection instance = new collection();
        instance.kee = "done";
        boolean expResult = true;
        boolean result = instance.done();
        assertEquals(expResult, result);
    }
    
}
