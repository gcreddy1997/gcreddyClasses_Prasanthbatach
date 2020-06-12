package class1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonProgram {

	public static List<WebElement>l; 
	
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		// some comments added in line number 22
		//invoking the URL
		driver.get("https://www.amazon.com/");
		
		//selecting todays deal
		driver.findElement(By.xpath("(//*[contains(text(),'Today')])[1]")).click();
		
		//find the no. of cookies and delete them
		int x = driver.manage().getCookies().size();
		System.out.println("size of cookies" +x );
		driver.manage().deleteAllCookies();
		int y = driver.manage().getCookies().size();
		System.out.println("size of cookies" +y );
		
		//select baby checkbox
		driver.findElement(By.xpath("(//*[@class='a-label a-checkbox-label'])[3]")).click();
		//make list and store 32 elements
		l = driver.findElements(By.xpath("//*[@class='a-row dealContainer']"));
		System.out.println("size of list" +l.size() );
			//select 2 element
		l.get(1).click();
			//select last element of 2 element
		l = driver.findElements(By.xpath("//*[@class='a-section aok-relative s-image-fixed-height']"));
		System.out.println("size of list" +l.size() );
		//select last element
		l.get(l.size()-1).click();
		// just for checking in line number 52
	
		
	
		
		
		
	
		
				
		
		
		
		
		
		
		
		

	}

}
