package testNg_Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CM_AssertEqualsHard {
    @Test
    public void checkAssert()
    {
    	String actual="Hello";
    	String expected="hello";  //check both are equals or not 
    	Assert.assertEquals(actual,expected);
    	System.out.println("pass");
    }
    
}
