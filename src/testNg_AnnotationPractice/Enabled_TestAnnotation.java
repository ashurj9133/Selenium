package testNg_AnnotationPractice;

import org.testng.annotations.Test;

public class Enabled_TestAnnotation {
	@Test(enabled=true)
	  public void createUser()
	  {
		  System.out.print("user created");
	  }
		@Test(enabled=true)
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
