package class1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class salesforce {
public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\chromedriver.exe");	
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.salesforce.com/in/form/sem/crm-systems/?d=7010M000002If0w&DCMP");
		Thread.sleep(4000);

		driver.findElement(By.name("UserFirstName")).sendKeys("Gcreddy");
		driver.findElement(By.name("UserLastName")).sendKeys("Gopu");
		driver.findElement(By.name("UserTitle")).sendKeys("Sales Manager");
		driver.findElement(By.name("UserEmail")).sendKeys("gcr@gmail.com");
		driver.findElement(By.name("UserPhone")).sendKeys("9871547847");
		driver.findElement(By.name("CompanyName")).sendKeys("gcreddyclasses,com");
		driver.findElement(By.name("CompanyEmployees")).sendKeys("1-15 employees");
				
		
	}

}
