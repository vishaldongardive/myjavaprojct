package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotEg1 {

	private static File source;

	public static void main(String[] args)throws InterruptedException,IOException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mtc\\seleniumPractice2022\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(1000);
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File dest=new File("C:\\Users\\Mtc\\Desktop\\New folder\\ScreenShot.png");
	FileHandler.copy(source, dest);
	}
	
	}


