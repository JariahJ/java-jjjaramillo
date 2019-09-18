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
public class AppTest {
   
@Test
  public void testReverseString(){
      App instance = new App();
      instance.input = "ABCDEFG";
      instance.numShifts = 1;
      String expected = "HGFEDCB";
      String answer = instance.run(instance.a, instance.numShifts,instance.input);
      assertEquals(expected,answer);
      
  }
   
    
}
