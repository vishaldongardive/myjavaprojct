package webElementsMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedExample {

	public static void main(String[] args) throws InterruptedException {
System.setProperty  ("webdriver.chrome.driver","C:\\Users\\Mtc\\seleniumPractice2022\\chromedriver.exe\\");
WebDriver driver=new ChromeDriver();
		driver.get("https://engb.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@role='button'])[2]")).click();
		Thread.sleep(8000);
		WebElement Female= driver.findElement(By.xpath("//input[@value='1']"));
		boolean Result=Female.isSelected();
		System.out.println(Result);
		Thread.sleep(2000);
		 Female.click();
		 Thread.sleep(2000);
		 boolean Result1=Female.isSelected();
		 System.out.println(Result1);
	}

	}


