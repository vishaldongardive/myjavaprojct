package testNGAnnotations;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsStudy {
  @Test 
  public void ValidateUserID() 
  {
	  Reporter.log("User ID is validated", true);
	  
  }
  @BeforeMethod
  public void login()
  {
	  Reporter.log("login is done", true);
  }
  @AfterMethod
  public void logout()
  {
	Reporter.log("log out done",true);  
  }
}