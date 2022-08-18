package webElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendkeysStudy {

	public static void main(String[] args)throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Mtc\\seleniumPractice2022\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https;//engb.facebook.com/");
       Thread.sleep(2000);
       String text=driver.findElement(By.xpath("//button[@type=submit']")).getText();
       System.out.println("Text is"+text);
	}

}
