package setSizeposition;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSizeStudy {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mtc\\seleniumPractice2022\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.manage().window();
		driver.get("https://kite.zerodha.com/");
		//to set  size we need to create object of Dimension class
		Dimension d=new Dimension(0, 100);
		driver.manage().window().setSize(d);

	}

}
