package kiteBase;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class KiteBaseStudy 
{
	protected WebDriver driver;
	public void openApplication()
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Mtc\\Downloads\\chromedriver_win32\\chromedriver.exe");
    driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.Facebook.com/");
   // Reporter.log("launching Kite APP",true);
  //  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}

}
