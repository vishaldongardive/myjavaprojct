package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HarrdAssertStudy {
	@Test
  public void myMethod()
  {
	  String a="test";
	  String b="null";
	  Assert.assertNotNull(b,"TC is failed value is  Null");
	  Assert.assertNull(a,"TC is failed value is not Null");
	//  Assert.assertNotNull(a, "TC is failed values is null");
	//  Assert.assertNull(b, "TC is failed value is not Null");
	  
	  
  }
}
