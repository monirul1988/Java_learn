package Learn;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class exceldata {

	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();
        FileInputStream path = new FileInputStream(System.getProperty("user.dir") + "\\data.properties");
		prop.load(path);
		FileInputStream f = new FileInputStream(prop.getProperty("Datapath"));
			
		
		//FileInputStream f=new FileInputStream("C:\\My_DOC\\Selenium\\testdata.xlsx"); 
		XSSFWorkbook wb = new XSSFWorkbook(f);
		

		
		
		
		
		
		
		
	

}}




