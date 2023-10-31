package part3RoughWork;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataInExcelSheet {
//write the data in excel sheet in particular row and cell no
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\ashutosh\\Desktop\\JavaFullCourse\\Ashu.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh=book.getSheet("sheet4");
		sh.createRow(0).createCell(9).setCellValue("mohania");
		FileOutputStream fio=new FileOutputStream("C:\\Users\\ashutosh\\Desktop\\JavaFullCourse\\Ashu.xlsx");
		book.write(fio);

	}

}
