package testNGXMStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestXML1 {
  @Test
  public void a()
  {
		  Reporter.log("a method is runnng",true);
		   }
  @Test
  public void b()
  {
	  Reporter.log("b method is running", true);
	   }
  @Test
  public void c()
  {
	  Reporter.log("c method is running",true);
  }
}
