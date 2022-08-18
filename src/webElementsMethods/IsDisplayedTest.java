package webElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedTest {

	private static final WebElement CheckElement = null;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mtc\\seleniumPractice2022\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		WebElement checkElement=driver.findElement(By.id("displayed-text"));
		System.out.println(CheckElement.isDisplayed());
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@value='Hide']")).click();
		Thread.sleep(4000);
		System.out.println(CheckElement.isDisplayed());

	}

}
