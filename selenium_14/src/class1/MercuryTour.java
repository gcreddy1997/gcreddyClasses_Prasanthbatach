package class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MercuryTour {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       //System.setProperty("webdriver.chrome.driver","");
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver(); 
	    driver.get("http://newtours.demoaut.com");
	    Thread.sleep(2000);
	    
	 /*   driver.navigate().to("http://gmail.com");
	    driver.navigate().back();
	    Thread.sleep(1000);
	    driver.findElement(By.name("userName")).sendKeys("mercury");
	    Thread.sleep(1000);
	    driver.findElement(By.name("password")).sendKeys("mercury");
	    Thread.sleep(1000);
	    driver.findElement(By.name("login")).click();
	    Thread.sleep(1000);
	    driver.close();  */
	    
	}

}
