package setSizeposition;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPositionStudy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mtc\\seleniumPractice2022\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.manage().window();
		driver.get("https://vctcpune.com/");
	Thread.sleep(2000);
	System.out.println(driver.manage().window().getPosition());
	//create object of point class and pass x and y values
	Point p=new Point(10, 0);
	//call setPosition method and pass object of class point class
	driver.manage().window().setPosition(p);


	}

}
