package class1;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Desktop_Application_Automation {

	public static void main(String[] args) throws IOException, AWTException, HeadlessException, UnsupportedFlavorException, InterruptedException {
		// JavaRobot  --> need not download any specific jar.
		// Java Robot is inbuilt in Java
		//invoke  calulculator
	       Runtime.getRuntime().exec("Calc.exe");
		   Thread.sleep(1000);
		//take data : 20
		StringSelection x = new StringSelection("20");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(x,null);
		
		// control +V action I am doing in desk top applications
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		
		// clicking on + button
		r.keyPress(KeyEvent.VK_ADD);
		r.keyRelease(KeyEvent.VK_ADD);
		Thread.sleep(1000);
			
		//take data 40
		StringSelection y = new StringSelection("40");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(y,null);
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		
		//click on = 
		r.keyPress(KeyEvent.VK_EQUALS);
		r.keyRelease(KeyEvent.VK_EQUALS);
		Thread.sleep(1000);
		
		//write click
		r.keyPress(KeyEvent.VK_CONTEXT_MENU);
		r.keyRelease(KeyEvent.VK_CONTEXT_MENU);
		Thread.sleep(1000);
		//down
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
						
		//copy clicking on Enter it will store in clipboard
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER); 
		Thread.sleep(1000);
		
		//GET THE DATA FROM CLIPBOARD  // explicit type casting
		String z = (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
		//print...
		Thread.sleep(1000);
		System.out.println(z);
	}

}
