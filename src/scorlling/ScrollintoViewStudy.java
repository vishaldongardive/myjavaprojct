package scorlling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollintoViewStudy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mtc\\seleniumPractice2022\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.manage().window();
		driver.get("https://vctcpune.com/");
	Thread.sleep(200);
	WebElement seliniumepratice = driver.findElement(By.xpath("//a[contains(text().'Click to')]"));
	JavascriptExecutor Js = (JavascriptExecutor)driver;
 Js.executeScript("arguments[0].scrollIntoView();",seliniumepratice);
	}

}
