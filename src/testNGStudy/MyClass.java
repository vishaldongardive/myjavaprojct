package testNGStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyClass {
  @Test
  public void mymethod()
  {
	  System.out.println("HI this written in printing statement");
	 Reporter.log("HI this is written in reporter without boolean value ");
	 Reporter.log("HI this is written in reporter with boolean value",  false);
  }
}
