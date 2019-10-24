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
public class additionJobTest {

    /**
     * Test of run method, of class additionJob.
     */
    //@org.junit.jupiter.api.Test
    @Test
    public void testRun() {
        System.out.println("run");
        queueAdditions qa = new queueAdditions();
        qa.read();
        additionJob instance = new additionJob(qa);
        instance.run();
        int expected = qa.q.size();
        assertSame(expected, 1);
    }
    
}
