package class1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;



public class SikuliClass_Behavior {

	public static void main(String[] args) throws InterruptedException, FindFailed {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver(); 
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    driver.get("https://www.imagesbazaar.com/");
	    Thread.sleep(2000);	
	    
	    // Sikulix class
	    Screen s = new Screen();
	    Thread.sleep(6000);
	    
	    s.click("signIn.PNG");
	    Thread.sleep(2000);
	    
	    s.click("Register.PNG");
	    Thread.sleep(2000);
	    
	    s.type("FirstName.PNG", "Gnanendra");
	    Thread.sleep(1000);
	    
	    s.type("Last_Name.PNG","Kumar");
	    Thread.sleep(1000);
	    
	    s.highlight(10,"Red");
	    Thread.sleep(2000); 
	    
	    
	
	   
	    
	    
	    
	    
	    
	    
	    
	    
	    

	}

}
