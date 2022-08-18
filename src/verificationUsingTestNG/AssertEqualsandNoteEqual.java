package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEqualsandNoteEqual {
  @Test
  public void myMethod() 
  {
	  String a="pune";
	  String b="pune";
	  String c="mumbai";
	  //1.if a and b are equal TC should be Passed
	 // i want to verify a equals b,equals c we will be using hard Assert to verify
//Assert.assertEquals(a, c,"A is not equals to C TC is failed");
	Assert.assertNotEquals(a, b,"A and b are equal hence TC failed");	  
  }
}
