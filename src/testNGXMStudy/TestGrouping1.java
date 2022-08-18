package testNGXMStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestGrouping1 {
  @Test(groups = {"sanity"})
	  public void a()
	  {
			  Reporter.log("a method is runnng",true);
			   }
	  @Test(groups = {"regression"})
	  public void b()
	  {
		  Reporter.log("b method is running", true);
		   }
	  @Test
	  public void c()
	  {
		  Reporter.log("c method is running",true);
	  }
	@Test
	public void d()
	{
		Reporter.log("d method is running",true);
  }
}
