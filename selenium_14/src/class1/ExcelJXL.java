package class1;

import java.io.File;
import java.io.IOException;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class ExcelJXL {
	public static void main(String[] args) throws BiffException, IOException, RowsExceededException, WriteException {
		File fis = new File("‪C:\\Users\\DELL\\Desktop\\JexcelCode_Online1.xls");
		Workbook rwb = Workbook.getWorkbook(fis);   // workbook
		Sheet rsh = rwb.getSheet(0);   // sheet
		
		int nur = rsh.getRows();  // no of used rows
		int nuc = rsh.getColumns();  // no of used columns
		System.out.println("No of used rows  :"+ nur);
		System.out.println("No of used Columns  :"+ nuc);
		
		WritableWorkbook wwb = Workbook.createWorkbook(fis, rwb);
		WritableSheet wsh = wwb.getSheet(0);
		
		for (int i =1; i<nur; i++){
			String name = rsh.getCell(0, i).getContents();
			String id = rsh.getCell(1, i).getContents();
			String dept = rsh.getCell(2, i).getContents();
			String salary = rsh.getCell(3, i).getContents();
			
			System.out.println(name);
			System.out.println(id);
			System.out.println(dept);
			System.out.println(salary);
			
			Label l = new Label(4,i,"Success");
			wsh.addCell(l);
		}
		wwb.write();  // saves the file
		
		wwb.close();
		rwb.close();
}
}