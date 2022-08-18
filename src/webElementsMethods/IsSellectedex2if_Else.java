package webElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSellectedex2if_Else {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Mtc\\seleniumPractice2022\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.get("https://engb.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(8000);
		WebElement Famale=driver.findElement(By.xpath("//input[@value='1']"));
		boolean Result=Female.isSelected();
		if(Result==true)//will check for condition//checking 1st time
		{
			System.out.println("Radio button is already selected");
		}
	else {
		System.out.println("Radio button is not selected");
	female.click();//now element is selected
		boolean Result1=female.isSelected();
		if(Result1==true)//check 2nd time
		{
			System.out.println("Radio button is selected now");
			}
		else {
			System.out.print("Please select Radio button");
		}
	}
		

	}

}
