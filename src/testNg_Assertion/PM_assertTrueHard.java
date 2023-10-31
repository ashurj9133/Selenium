package testNg_Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PM_assertTrueHard {
	 @Test
	    public void checkAssert()
	    {
	    	String actual="Hello";
	    	String expected="Hell";  //check both are word first letter partially
	    	Assert.assertTrue(actual.contains(expected));   
	    	System.out.println("pass");
	    }
}
