package practice;

import java.io.File;
import java.io.IOException;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteHiddenData {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mtc\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 File myfile=new  File("F:\\selenium installation\\9thApriEveninTest.xlsx");
		 Sheet=WorkbookFactory.create(myfile).getSheet("Sheet3");
		 String UID = mySheet.getRow(0).getCell(0).getStringCellValue();
		 String PWD = mySheet.getRow(0).getCell(1).getStringCellValue();
		 String PIN = mySheet.getRow(0).getCell(2).getStringCellValue();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		
		WebElement Userid = driver.findElement(By.id("userid"));
		WebElement password = driver.findElement(By.id("password"));
        WebElement submitbutton = driver.findElement(By.xpath("=//button[@typeubmit']"));
        Userid.sendKeys(UID);
        password.sendKeys(PWD);
        submitbutton.click();
        Thread.sleep(200);
        
       WebElement pin = driver.findElement(By.id("pin"));
      WebElement continuebutton = driver.findElement(By.xpath("//button[@typeubmit']"));
      pin.sendKeys(PIN);
      continuebutton.click();
      Thread.sleep(200);
      
      WebElement UID1 = driver.findElement(By.xpath("//span[@class='user-id']"));
     String expectedUserID="ELR321";
     String actualUserID = UID1.getText();
     if(expectedUserID.equals(actualUserID))
     {
    	 System.out.println("Actual and Expected UserID are matching tc is passed");
     }
     else {
     System.out.println("Actual and Expected UserID are not matching tc is Failed");
    	 }
     UID1.click();
     driver.findElement(By.xpath("//a[@target='_self']")).click();
     driver.close();
	}
}


	


