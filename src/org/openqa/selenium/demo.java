package org.openqa.selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	


		public static void main(String[] args) 
		{
			
			System.setProperty("webdriver.chrome.driver","F:\\selenium installation\\chromedriver_win32 (1)\\chorme.exe\\");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.google.com");
			
		}
	}
