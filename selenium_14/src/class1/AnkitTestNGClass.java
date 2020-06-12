package class1;

import org.junit.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class AnkitTestNGClass {
  @Test 
  public void Ankit() {
	  System.out.println("Ankit test case is executing");
	  System.out.println(Thread.currentThread().getId());
	 }
  
   
  @Test
  public void yashmi() {
	  System.out.println("AfterClass test case is executing");
	  System.out.println(Thread.currentThread().getId());
  }
 
  @Test
  public void Prasanth() {
	  System.out.println("Prasanth test case is executing");
	  System.out.println(Thread.currentThread().getId());
  }
  
  @Test
  public void Ankita() {
	  System.out.println("Ankita test case is executing");
	  System.out.println(Thread.currentThread().getId());
  }
  
}
