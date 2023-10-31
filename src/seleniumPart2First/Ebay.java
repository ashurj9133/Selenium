package seleniumPart2First;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebay {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
	      driver.get("https://www.ebay.com/");
	      driver.findElement(By.cssSelector("[placeholder='Search for anything']")).sendKeys("clock");
	      driver.findElement(By.cssSelector("[value='Search']")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//button[text()='Save this search']")).click();
	     
	     WebElement d= driver.findElement(By.xpath("//a[text()='customer service page']/.."));
	     System.out.println(d.getCssValue("font"));
	     System.out.println(d.getCssValue("color"));
	     String title=driver.findElement(By.xpath("//a[text()='customer service page']/..")).getText();
	     System.out.println("title: "+title);
//	      
	}

}
