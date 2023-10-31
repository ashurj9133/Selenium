package testNg_AnnotationPractice;

import org.testng.annotations.Test;

public class PriorityTestAnnotation {
	
		@Test(priority=0)
	  public void createUser()
	  {
		  System.out.print("user created");
	  }
		@Test(priority=1)
	  public void modifyUser()
	  {
		  System.out.println("user modified");
	  }
		@Test(priority=-2)
		public void deleteUser()
		{
			System.out.println("user deleted");
		}
}
