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
  public void testRun(){
      App instance = new App();
      instance.input = "ABCDEFG";
      instance.numShifts = 1;
      String expected = "HGFEDCB";
      String answer = instance.run(instance.a, instance.numShifts,instance.input);
      assertEquals(expected,answer);
      
  }
  
  @Test
  public void testRun2(){
      App instance = new App();
      instance.input = "ZYXWV";
      instance.numShifts = 3;
      String expected = "YZ_.A";
      String answer = instance.run(instance.a, instance.numShifts,instance.input);
      assertEquals(expected,answer);
      
  }
  
  @Test
  public void testRun3(){
      App instance = new App();
      instance.input = "AZIORLMFGN";
      instance.numShifts = 7;
      String expected = "UNMTSYVPEH";
      String answer = instance.run(instance.a, instance.numShifts,instance.input);
      assertEquals(expected,answer);
      
  }
  
  @Test
  public void testReverse(){
  App instance = new App();
  instance.input = "ABCDE";
  String expected = "EDCBA";
  assertEquals(expected, instance.reverseString(instance.input));
  
  }
  
  @Test
  public void testReverse2(){
  App instance = new App();
  instance.input = "Z_RFZZZNNOA";
  String expected = "AONNZZZFR_Z";
  assertEquals(expected, instance.reverseString(instance.input));
  
  }
  
  @Test
  public void testReverse3(){
  App instance = new App();
  instance.input = "NGLASUZVMEQ";
  String expected = "QEMVZUSALGN";
  assertEquals(expected, instance.reverseString(instance.input));
  
  }
    
}
