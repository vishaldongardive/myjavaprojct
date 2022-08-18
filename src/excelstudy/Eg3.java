package excelstudy;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Eg3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File myfile=new File("F:\\selenium installation\\9thApriEveninTest.xlsx");
		Workbook myworkbook = WorkbookFactory.create(myfile);
	    Sheet mysheet = myworkbook.getSheet("Sheet1");
	    Row myRow = mysheet.getRow(0);
	    Cell myCell = myRow.getCell(0);
	    CellType cellInfoType = myCell.getCellType();
	    System.out.println(cellInfoType);
	    System.out.println(mysheet.getRow(0).getCell(1).getStringCellValue());
	}

}
