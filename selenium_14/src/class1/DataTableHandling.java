package class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataTableHandling {
	public static String bseOrNse;
	public static String period;
	public static String gainersOrLosers;

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.navigate().to("https://money.rediff.com/gainers/bsc/");
		Thread.sleep(3000);

	//	Scanner sc = new Scanner(System.in);
	//	System.out.println("Please enter BSE or NSE");
	//	bseOrNse = sc.nextLine();

		//if (bseOrNse.equalsIgnoreCase("NSE")) {
		//	driver.findElement(By.xpath("//*[@class='grey2 f12']/following-sibling::*[1]/descendant::*[1]")).click();
		//}
		
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
		//System.out.println("Please enter Gainers / Losers");
		//gainersOrLosers = br.readLine();
			
	//	System.out.println("Please enter your period  :");
	//	period = br.readLine();
				
	//	driver.findElement(By.xpath("//*[@href='//money.rediff.com/"+gainersOrLosers.toLowerCase()+"/"+bseOrNse.toLowerCase()+"/"+period.toLowerCase()+"']")).click();
		

	}

}
