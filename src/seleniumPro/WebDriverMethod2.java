package seleniumPro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethod2 {


	public static void main(String[] args)throws InterruptedException{
		System.setProperty("webdriver chrome.driver","C:\\Users\\Mtc\\seleniumPractice2022\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/");
      Thread.sleep(5000);
      String title=driver.getTitle();
      System.out.println(driver.getTitle());
      System.out.println(title);
	}

}
 