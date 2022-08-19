import org.openqa.selenium.WebDriver;

/selniumProject/src/selniumProgramme/BrowserLaunch.javapackage selniumProgramme

public class BrowserLaunch {

	public static void main(String[] args) 
	{
		//set the path of Executable Browser Driver
		System.setProperty("webdriver.chrome.driver","F:\\selenium installation\\chromedriver_win32 (1)\\chorme.exe\\");
  WebDriver driver=new ChromeDriver();//parent p=new child (webDriver is parent & chormeDriver is child)
  driver.get("https://www.selenium.dev.");
  
    
	}
}