package actionsClass;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MovetoElementStudy {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","F:\\selenium installation\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		//1.to take mouse actions,need to create object of actions class and pass webDriver object as parameter
		Actions act=new Actions(driver);
		//find Eelement to be act
		WebElement aboutsUs=driver.findElement(By.xpath("//a[text()='About Us']"));
		//now action ad perform
	act.moveToElement(aboutsUs).perform();
	//	WebElement aboutUs;
		
		

	}

}
