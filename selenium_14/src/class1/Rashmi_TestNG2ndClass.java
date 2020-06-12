package class1;

import org.junit.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Rashmi_TestNG2ndClass {
  @Test
  public void Gnanendra() {
	  System.out.println("BeforeClass test case Executing");
	  System.out.println(Thread.currentThread().getId());
  }
 
  @Test
  public void Srikanth() {
	  System.out.println("Srikanth test case Executing");
	  System.out.println(Thread.currentThread().getId());
  }
  
  @Test 
  public void Sakshi() {
	  System.out.println("Sakshi test case Executing");
	  System.out.println(Thread.currentThread().getId());
  }
  @Test 
  public void Prasanth() {
	  System.out.println("Prasanth test case Executing");
	  System.out.println(Thread.currentThread().getId());
  }
  
  
}
