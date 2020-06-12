package class1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Driver_Gmail {
	
	static FileOutputStream fout;

	public static void main(String[] args) throws IOException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		//Throwable
		GmailMethods gm = new GmailMethods();
		Method [] m = gm.getClass().getMethods();  // reflect method
		
		FileInputStream fis = new FileInputStream("C:\\Users\\DELL\\Desktop\\gmailexcel.xlsx");
	
		XSSFWorkbook rwb = new XSSFWorkbook(fis);
		XSSFSheet rsh1 = rwb.getSheetAt(0);
		XSSFSheet rsh2 = rwb.getSheetAt(1);
		
		int nur1 = rsh1.getPhysicalNumberOfRows();
		int nur2 = rsh2.getPhysicalNumberOfRows();
		System.out.println("nur1 : " + nur1);
		System.out.println("nur2 : " + nur2);
		// i loop representing sheet1
		for (int i=1; i<nur1; i++){
			String runmode = rsh1.getRow(i).getCell(2).getStringCellValue();
			System.out.println(runmode);
			
			// key no1.
			if (runmode.equalsIgnoreCase("Yes")){
				String tid = rsh1.getRow(i).getCell(0).getStringCellValue();
				
				// j loop representing sheet 2
				for (int j=1; j<nur2; j++) {
					String sid = rsh2.getRow(j).getCell(0).getStringCellValue();
					
					// key no. 2
					if(tid.equalsIgnoreCase(sid)){
						String method = rsh2.getRow(j).getCell(2).getStringCellValue();
						String l = rsh2.getRow(j).getCell(3).getStringCellValue();
						String d = rsh2.getRow(j).getCell(4).getStringCellValue();
						String c = rsh2.getRow(j).getCell(5).getStringCellValue();
						
						System.out.println("Method : "+ method);
						System.out.println("l : "+ l);
						System.out.println("d : "+ d);
						System.out.println("c : "+ c);
						
						// k loop represents the methods in Gmail methods class
						for(int k=0; k<m.length; k++){
						   
							// key 3
//							if(method.equalsIgnoreCase(m[k].getName())){
//							// method variable name coming from Excel sheet
//							// m[k].getName();  --> taking name of the method from m array.
//								System.out.println(method);
//								
//						      String res =     (String) m[k].invoke(gm,l,d,c);
//						    XSSFCell cell = rsh2.getRow(j).createCell(6);
//							cell.setCellValue(res);
							
							if( method.equalsIgnoreCase(m[k].getName())){
								String 	res = (String) m[k].invoke(gm, l, d,c);
								XSSFCell cell = rsh2.getRow(j).createCell(6);
					            cell.setCellValue(res);
							
							fout = new FileOutputStream("C:\\Users\\DELL\\Desktop\\gmailexcel.xlsx");
							
							}
						}
					}
				}			
			}
		}
		rwb.write(fout);  // saves the file	
rwb.close();
		
		
	}

}
