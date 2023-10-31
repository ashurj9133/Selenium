package anonymousAssinment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartWebelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.flipkart.com/");
        //driver.findElement(By.id("datepicker")).click();
        try {
		       driver.findElement(By.xpath("//button[text()='✕']")).click();
				}
				catch(Exception e)
				{
					
				}
  WebElement dr=      driver.findElement(By.xpath("//div[text()='Home & Furniture']"));
        Actions act=new Actions(driver);
        act.moveToElement(dr).perform();
 WebElement dc=       driver.findElement(By.linkText("Cleaning & Bath"));
 Actions ac=new Actions(driver);
 ac.moveToElement(dc).perform();
 driver.findElement(By.linkText("All")).click();
 WebElement d= driver.findElement(By.xpath("//span[text()='Women']"));
 Actions a=new Actions(driver);
 a.moveToElement(d).perform();
 List<WebElement> ad=driver.findElements(By.xpath("//div[@class='_1QrT3s']"));
 System.out.println("Number of elements in the list: " + ad.size());
 for(WebElement element:ad)
 {
 
	 System.out.println(element.getText());
 
 }
 int elementCount = ad.size();
 System.out.println("Number of elements in the list: " + elementCount);
 
 driver.quit();


	}

}
