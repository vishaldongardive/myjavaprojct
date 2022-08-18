package seleniumPro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] arwebdrivgs) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mtc\\seleniumPractice2022\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.Amzon.com/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
        driver.findElement(By.xpath("//a[@id='u_0_2_Fi']")).click();	
    	Thread.sleep(10000);
    	
    	driver.close();
         
	}

}
