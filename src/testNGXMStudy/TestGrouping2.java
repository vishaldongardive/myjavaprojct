package testNGXMStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestGrouping2 {
  @Test(groups = {"sanity","regression"})
	  public void f()
	  {
			  Reporter.log("a method is runnng",true);
			   }
	  @Test
	  public void g()
	  {
		  Reporter.log("b method is running", true);
		   }
	  @Test
	  public void h()
	  {
		  Reporter.log("c method is running",true);
	  }
	@Test
	public void i()
	{
		Reporter.log("i method is running",true);
	}
  }
  

