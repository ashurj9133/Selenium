package testNg_AnnotationPractice;

import org.testng.annotations.Test;

public class InvocationTestAnnotation {
	@Test(invocationCount=3,enabled=false)
	  public void createUser()
	  {
		  System.out.print("user created");
	  }
		@Test
	  public void modifyUser()
	  {
		  System.out.println("user modified");
	  }
		@Test
		public void deleteUser()
		{
			System.out.println("user deleted");
		}
}
