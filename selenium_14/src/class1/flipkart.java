package class1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class flipkart {
	public static WebElement e;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//invoking the browser
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
		//providing the url
		driver.navigate().to("https://www.flipkart.com");
		
		
		// if dropdown is displayed then click on x button
	    e = driver.findElement(By.xpath("//*[@class='_2AkmmA _29YdH8']"));
		if(e.isDisplayed()){
			e.click();
		}
		
		// mouse over activities
		Actions a = new Actions(driver);
		e = driver.findElement(By.xpath("(//*[@class='_1QZ6fC _3Lgyp8'])[3]"));
		a.moveToElement(e).build().perform();
		
		//(//*[@class='QPOmNK'])[12]/child::*[4]/a
		// moving the sub element
		
		
		
		
	
		
		
		

	}

}
