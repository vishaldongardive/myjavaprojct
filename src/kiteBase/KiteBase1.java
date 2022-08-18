package kiteBase;

import java.sql.Driver;
import java.time.Duration;

import org.testng.Reporter;

public class KiteBase1 {

	public static void main(String[] args) {
		   Driver.new chrome 
		    driver.mange().window().maimize();
		    Driver.get("https://kite.zerodha.com/");
		    Reporter.log("launching Kite APP",true);
		    driver.mange()Timeouts().implicitlyWait(Duration.ofMillis(1000));
			}

	}


