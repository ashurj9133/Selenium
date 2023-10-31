package part3RoughWork;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;

public class FetchData {
//fetch all the data in excel sheet
//	public static void main(String[] args) throws EncryptedDocumentException, IOException {
//	FileInputStream fis=new FileInputStream("C:\\Users\\ashutosh\\Desktop\\JavaFullCourse\\Book.xlsx");
//	Workbook book=WorkbookFactory.create(fis);
//	Sheet sh=book.getSheet("Sheet1");
//	DataFormatter f=new DataFormatter();
//	for(int i=0;i<=sh.getLastRowNum();i++)
//	{
//		Row ro=sh.getRow(i);
//		for(int j=0;j<ro.getLastCellNum();j++)
//		{
//			String value=f.formatCellValue(ro.getCell(j));
//			System.out.print(value+"\t");
//		}
//		System.out.println();
//	}
//
//	}
	public static void main(String[] args) throws EncryptedDocumentException, IOException  {
		FetchData excelReader = new FetchData();
		 //Object[][] data = excelReader.writeDataInExcelSheet("Sheet1");
		 try {
	            Object[][] data = excelReader.writeDataInExcelSheet("Sheet1");
	            for (int i = 0; i < data.length; i++) {
	                for (int j = 0; j < data[i].length; j++) {
	                    System.out.print(data[i][j] + "\t");
	                }
	                System.out.println();
	            }
	        } catch (EncryptedDocumentException | IOException e) {
	            e.printStackTrace();
	        }
	    }
	
		
	public Object[][] writeDataInExcelSheet(String sheetname) throws EncryptedDocumentException, IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\ashutosh\\Desktop\\JavaFullCourse\\Book.xlsx");
        Workbook book = WorkbookFactory.create(fis);
        Sheet sh = book.getSheet(sheetname);
        int lastrow = sh.getLastRowNum();
        int lastcell = sh.getRow(0).getLastCellNum();
        Object[][] dataObjects = new Object[lastrow+1][lastcell]; // Fix array dimensions

        for (int i = 0; i <= lastrow; i++) {
            for (int j = 0; j < lastcell; j++) { // Remove the extra semicolon
                dataObjects[i][j] = sh.getRow(i).getCell(j).getStringCellValue();
            }
        }

        return dataObjects;
    }

}
