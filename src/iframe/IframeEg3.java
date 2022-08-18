package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeEg3 {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Mtc\\seleniumPractice2022\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3school.com/js/tryit.aspfilename=tryjs__myfirst");
		Thread.sleep(1000);
		driver.switchTo().frame("iframe-name");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[text()='about us')])[1]")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//input[@value='Radio1")).click();
	}

}
