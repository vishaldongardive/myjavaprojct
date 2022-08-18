package lunchBrowzerFirefox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;

import serialparaallelExecuation.FirefoxDriver;

public class LunchFirefoxStudy {

	public static void main(String[] args) {
		 System.setProperty("webdriver.gecko.driver","C:\\Users\\Mtc\\Downloads\\geckodriver.exe\\");
		// WebDriver driver=new FirefoxDriver();
		 //driver.manage().window().maximize();
		// 	driver.get("http://kite.zerodha.com/");
		 WebDriver driver=(WebDriver) new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.get("http://Kite.zerodha.com/");
		 }

	}


