package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeEg1 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Mtc\\seleniumPractice2022\\chromedriver.exe\\");
	WebDriver driver=new ChromeDriver();
	driver.manage().window();
	driver.get("https://www.facebook.com/is/tryit.aspfilename=tryjs_myfirst");
	Thread.sleep(1000);
	driver.switchTo().frame("iframeResult");
	Thread.sleep(1000);
	driver.findElement(By.xpath("button[@type='button']")).click();
	

	}

}
