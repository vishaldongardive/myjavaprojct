package excelstudy;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import graphql.language.Value;

public class Eg1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
    File myfile=new  File("F:\\selenium installation\\9thApriEveninTest.xlsx");
     mySheet=workbookfactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
    System.out.println(value);
	}

}
