package serialparaallelExecuation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Test3 {
  @Test
  public void GooleLunch()
  {
	  System.setProperty("webdriver.gecko.driver","F:\\selenium installation\\geckodriver.exe");
	 	WebDriver driver=new FirefoxDriver();
	 	driver.manage().window().maximize();
	 	driver.get("https://www.google.com");
	 }
  }

