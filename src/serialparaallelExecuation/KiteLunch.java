package serialparaallelExecuation;

import org.openqa.selenium.WebDriver;

public class KiteLunch {

	public static void main(String[] args) {
		 System.setProperty("webdriver.gecko.driver","C:\\Users\\Mtc\\seleniumPractice2022\\geckodriver.exe");
		 	WebDriver driver=(WebDriver) new FirefoxDriver();
		 	driver.manage().window().maximize();
		 	driver.get("http://kite.zerodha.com/");
		 }
}
	  

	


