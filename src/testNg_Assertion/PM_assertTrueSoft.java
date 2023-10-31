package testNg_Assertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class PM_assertTrueSoft {
	@Test
    public void checkAssert()
    {
    	String actual="Java";
    	String expected="Ja";  
    	SoftAssert sa=new SoftAssert();
    	sa.assertTrue(actual.contains(expected));
    	System.out.println("pass");
    	sa.assertAll();
    }
}
