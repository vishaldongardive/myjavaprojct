package excelstudy;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Eg4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File myfile=new File("F:\\selenium installation\\9thApriEveninTest.xlsx");
		Workbook myworkbook = WorkbookFactory.create(myfile);
		  Sheet mysheet = myworkbook.getSheet("Sheet1");
		  double value = mysheet.getRow(1).getCell(0).getNumericCellValue();
		  System.out.println(value);
		  //reading boolean value
		   CellType type = mysheet.getRow(0).getCell(2).getCellType();
		   System.out.println(type);
		   // Reading string value
		   Cell myCell1 = mysheet.getRow(2).getCell(0);
           System.out.println(myCell1.getCellType());
           System.out.println(myCell1.getRichStringCellValue());
	}

}
