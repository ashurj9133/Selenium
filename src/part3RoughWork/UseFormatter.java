package part3RoughWork;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UseFormatter {

	public static void main(String[] args) throws EncryptedDocumentException, IOException  {
	UseFormatter d=new UseFormatter();	
	String data=d.excelsheet("sheet1",1,2);	//direct print nhi hoga isliye string data variable me store krwa rhe hai 
	                                        //fir print krna hoga nhi to error aayega.              
	System.out.println(data);
	}
	public  String excelsheet(String sheetName, int rowNo, int cellNo) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\ashutosh\\Desktop\\JavaFullCourse\\Book.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh=book.getSheet(sheetName);
		
		DataFormatter format=new DataFormatter();
		String val=format.formatCellValue(sh.getRow(rowNo).getCell(rowNo));
			
	     return val;
	}
	
	

}
