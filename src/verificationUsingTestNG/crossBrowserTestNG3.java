package verificationUsingTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class crossBrowserTestNG3 {
	@Parameters("browserName")
  @Test
  public void myMethod(String Bname) 
 {
	  WebDriver driver=null;//declared driver here
	  if(Bname.equals("chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Mtc\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
	  }
	  else if(Bname.equals("firefox"))
	  {
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Mtc\\Downloads\\geckodriver.exe");
		  			 driver = new FirefoxDriver();
	  }
	  driver.manage().window().maximize();
	  
  }
}
