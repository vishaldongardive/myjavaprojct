package testNGStudy;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestNGTest {
  @Test
  public void lunchAmzon () {
  //This is for Firefox
  //System.setProperty("webdriver.gecko.driver","C:\\Users\\Mtc\\seleniumPractice2022\\geckodriver.exe");
	//WebDriver driver=new FirefoxDriver();
	//driver.manage().window().maximize();
	//driver.get("http://https://www.amazon.in/");
	System.setProperty("webdriver.gecko.driver","F:\\selenium installation\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://www.amazon.in/");
}
}