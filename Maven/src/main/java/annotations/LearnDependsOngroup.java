package annotations;

import org.testng.annotations.Test;

public class LearnDependsOngroup {

	
	 @Test(groups="Smoke")
	  public void Test1() throws Exception {
		 	throw new Exception();
		 // System.out.println("Executing Test1 testcase");
	  }
	  
	  @Test(groups="Regression")
	  public void Test2()  {
		  System.out.println("Executing test2 testcase");
		  

	  }
	  
	  @Test(dependsOnGroups="Smoke")
	  public void Test3()  {
		  System.out.println("Executing test2 testcase");
		  
	  }
	
	
}
