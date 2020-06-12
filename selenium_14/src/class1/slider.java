package class1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class slider {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.navigate().to("http://jqueryui.com/slider/");
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		WebElement e = driver.findElement(By.xpath("//*[@class='ui-slider-handle ui-corner-all ui-state-default']"));
		Actions a = new Actions(driver);
				
		a.dragAndDropBy(e, 200, 0).build().perform();
		Thread.sleep(1000);
		a.dragAndDropBy(e, 200, 0).build().perform();
		Thread.sleep(1000);
		a.dragAndDropBy(e, -100, 0).build().perform();
		Thread.sleep(1000);
		a.dragAndDropBy(e, -50, 0).build().perform();
		Thread.sleep(1000);
		driver.switchTo().defaultContent();;
		driver.quit();
		

	}

}
