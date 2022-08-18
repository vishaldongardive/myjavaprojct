package testNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MultipleKeywords {
  @Test(dependsOnMethods= {"c"},invocationCount=3,priority=-2)
  public void b() {
  
  Reporter.log("b method is running",true);
}
@Test
public void c()
{
Reporter.log("c method is running",true);
 }
@Test
public void d()
{
Reporter.log(" d method is running",true);
}
@Test
public void e()
{
Reporter.log("e method running true",true);
}
@Test
public void a()
{
Reporter.log("a method is running",true);
}
}

