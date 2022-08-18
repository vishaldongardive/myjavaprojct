package testNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InnovationCountStudy {
	@Test (invocationCount = 5)  
  public void  mymethod()
	{
	 Reporter.log("mymethod running true");
	}
}
