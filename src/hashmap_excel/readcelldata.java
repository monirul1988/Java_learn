package hashmap_excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.ss.formula.functions.Rows;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class readcelldata {

	public static void main(String[] args) throws IOException {
	
		FileInputStream fis= new FileInputStream("C:\\Users\\MDIslam\\java_learn\\Java_learn\\src\\hashmap_excel\\testdata.xlsx");
		
		HashMap h=new HashMap();
		
		
		
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		int sheetnumber=wb.getNumberOfSheets();
		
		for (int i=0;i<sheetnumber;i++)
		{
			
		   if(  wb.getSheetAt(i).equals("login"))
		   {
			 Sheet sheet=  wb.getSheetAt(i);
			 
				int rownumber = sheet.getLastRowNum();
			 
			 
			 {
				 
				 
				 for (int j=0;j<rownumber;j++)
				 {
					 
					Row  row =sheet.getRow(j); 
					Cell KeyCell= row.getCell(0);
					String username=KeyCell.getStringCellValue().trim();
					Cell KeyCell2= row.getCell(1);
					String password=KeyCell2.getStringCellValue().trim();
					
				   
					System.out.println( h.put(username, password));
					
				 }
				 
				 
				 
			 }
			 
			 
			 
		   }
			   
			 
				   
			
			
			
			
			
		}
		
		
		
		
		

	}

}
