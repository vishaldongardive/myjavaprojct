package lunchBrowzerFirefox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FacebookLunch {
	@Test
  public void lunchFacebook() throws InterruptedException 
  {
	  //this is for fireFox
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\Mtc\\seleniumPractice2022\\geckodriver.exe\\");
	  WebDriver driver=new FirefoxDriver();
	  Thread.sleep(5000);
	  
	  driver.manage().window().maximize();
	  driver.get("https://www.google.com");
	  
  }
}
