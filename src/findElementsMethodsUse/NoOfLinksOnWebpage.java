package findElementsMethodsUse;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoOfLinksOnWebpage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mtc\\seleniumPractice2022\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.manage().window();
		driver.get("https://vctcpune.com/");
		List<WebElement>links=(List<WebElement>) driver.findElements(By.tagName("a"));
		System.out.println("total number of links are"+links.size());
		for(WebElement L:links)
		{
			System.out.println(L.getText());
		}
		

	}

}
