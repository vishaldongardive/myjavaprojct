package excelstudy;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Eg5 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File myfile=new File("F:\\selenium installation\\9thApriEveninTest.xlsx");
		Workbook myworkbook = WorkbookFactory.create(myfile);
	    Sheet mysheet = myworkbook.getSheet("Sheet1");
	  //  reading multiple data single row
		for (int i=0;i<=3;i++)
		{
		String value = mysheet.getRow(0).getCell(i).getStringCellValue();
         System.out.println(value);
		}
         System.out.println("======================");
      // reading  Multiple data from single row column
         for (int i=0;i<=1;i++)
         {
        	 String value = mysheet.getRow(i).getCell(0).getStringCellValue();
        	 System.out.println(value);
         }
	
	}
	}
