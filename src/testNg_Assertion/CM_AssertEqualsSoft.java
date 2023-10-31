package testNg_Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CM_AssertEqualsSoft {
	@Test
    public void checkAssert()
    {
    	String actual="Java";
    	String expected="java";  //check both are equals or not 
    	SoftAssert sa=new SoftAssert();
    	sa.assertEquals(actual,expected);
    	System.out.println("pass");
    	sa.assertAll();
    }
}
