package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeEg2 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Mtc\\seleniumPractice2022\\chromedriver.exe\\");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.w3school.com/js/tryit.aspfilename=tryjs__myfirst");
	Thread.sleep(1000);
	driver.switchTo().frame("iframeResult");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[@type=']")).click();
	Thread.sleep(1000);
	driver.switchTo().defaultContent();//to swich focus to parent frame
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//a[@title='change theme'))[1]")).click();
	}

}
