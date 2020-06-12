package class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

public class GmailMethods {
	WebDriver driver;

	public String launch(String l, String d, String c) {
		if (l.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (l.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (l.equalsIgnoreCase("opera")) {
			driver = new OperaDriver();
		} else {
			driver = new InternetExplorerDriver();
		}

		driver.get(d);
		return ("done");
	}

	public String wait(String l, String d, String c) throws Exception {
		long t = Long.parseLong(d);
		Thread.sleep(t);
		return ("done");
	}

	public String fill(String l, String d, String c) {
		driver.findElement(By.xpath(l)).sendKeys(d);
		return ("done");
	}

	public String click(String l, String d, String c) {
		driver.findElement(By.xpath(l)).click();
		return ("done");
	}

	public String checkUserID(String l, String d, String c) {
		if (c.equalsIgnoreCase("valid") && driver.findElement(By.name("passwd")).isDisplayed()) {
			return ("Test Passed");
		} else if (c.equalsIgnoreCase("invalid") && driver.findElement(By.id("errormsg-o-email")).isDisplayed())
			;
		{
			return ("Test Passed");
		}
		/*
		 * else { return("Test Failed"); }
		 */
	}

	public String close(String l, String d, String c) throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
		return ("done");
	}

}
