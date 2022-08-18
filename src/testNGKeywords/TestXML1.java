package testNGKeywords;

import static org.testng.Assert.assertEqualsDeep;

import org.testng.Reporter;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

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
  @Test(timeOut = 500)
  public void c() throws InterruptedException
  {
	  Reporter.log("c method is running",true);
	  Thread.sleep(100);
  }
@Test
public void f()
{
	
	Reporter.log("f method is running",true);
}
}
  

