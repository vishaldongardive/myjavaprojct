package popupstudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser {



	public static void main(String[] args) throws InterruptedException {
	System.setProperty(	"webdriver.chrome.driver","C:\\Users\\Mtc\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(1000);
		driver.findElement(By.name("NewWindow")).click();
		Thread.sleep(1000);
		//to get single id(main page)-->
		Object StringidOfMainPage = driver.getWindowHandle();
		System.out.println(idOfMainPage);
		
	}

	}

	


