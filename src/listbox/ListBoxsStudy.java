package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class ListBoxsStudy {

	public static void main(String[] args)  throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mtc\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window();
		driver.get("https://vctcpune.com/");
		Thread.sleep(1000);
		 WebElement listbox = driver.findElement(By.id("dropdown-class-example"));
	//	Select s=new Select(listbox);
	//	SelectByIndex:selectByIndex(int arg0);
	//	s.selectByVisibleText("opention2");
	//	s.selectByValue("opention3");

	}

}
