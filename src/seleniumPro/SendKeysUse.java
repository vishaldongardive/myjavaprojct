package seleniumPro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysUse {

	public static void main(String[] args)throws InterruptedException
	{
		System.setProperty("webdriver chrome.driver","C:\\Users\\Mtc\\seleniumPractice2022\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/selenium/practice");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=autocomplete']")).sendKeys("Welcome");
	    Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=autocomplete']")).clear();

	}

}
