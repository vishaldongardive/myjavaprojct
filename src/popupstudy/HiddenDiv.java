package popupstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDiv {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Mtc\\seleniumPractice2022\\chromedriver.exe\\");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("htpps://www.facebook.com/");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[@clss='_2KpZ61_2doB4z")).click();

	}

}
