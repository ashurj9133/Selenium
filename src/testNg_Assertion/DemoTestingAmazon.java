package testNg_Assertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemoTestingAmazon {
   @Test(dataProvider="dataSupplier")
   //public void fetchData(String mobile,String watches,String camera,String tv)
   public void fetchData(String searchKeyword)
   {
	   WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
//	      
		 
		        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(searchKeyword);
		        driver.findElement(By.id("nav-search-submit-button")).click();
               System.out.println(driver.findElement(By.xpath("//span[contains(text(),' results for')]")).getText());
   }
   @DataProvider
   public Object[] dataSupplier()
   {
	   Object[] a=new Object[4];
	   a[0]="mobiles";
	   a[1]="watches";
	   a[2]="camera";
	   a[3]="tv";
	   return a;
   }
}
