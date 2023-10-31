package testNg_AnnotationPractice;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class PartialComparisonSoftAssert {
   @Test
   public void checkAssert()
   {
	   String actual="Java";
	   String expected="Ja";
	   
   SoftAssert sa=new SoftAssert();
   sa.assertTrue(actual.contains(expected));
   sa.assertEquals(actual,expected);
   sa.assertAll();
   System.out.println("pass");
    }

}