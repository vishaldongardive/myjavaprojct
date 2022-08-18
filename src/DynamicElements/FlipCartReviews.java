package DynamicElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;  
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipCartReviews {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Mtc\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window();
	driver.get("https://www.flipkart.com/");
	Thread.sleep(1000);
	//handle hidden div popup
	driver.findElement(By.xpath("//button[@class='_2Kpz61_2doB4z]")).click();
	//send keys in search bar
	driver.findElement(By.name("q")).sendKeys("i phone13");
	//click on search button
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(1000);
	WebElement review=driver.findElement(By.xpath("((//div[@class='col col7-7-12'])[1]//span)[6]"));
	System.out.println("Review for this phone is"+review.getText());
	
	

	}

}
