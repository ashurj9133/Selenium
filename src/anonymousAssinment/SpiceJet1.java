package anonymousAssinment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SpiceJet1 {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
      driver=new ChromeDriver(opt);
      driver.get("https://www.spicejet.com/");
      driver.manage().window().maximize();
      
     //WebElement d= driver.findElement(By.cssSelector("[class='imageSlideContainer']"));
      
      driver.findElement(By.xpath("//div[text()='Flights']"));
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      //driver.findElement(By.xpath("//div[text()='One Way']"));
     WebElement d= driver.findElement(By.xpath("//div[text()='From']"));
     d.click();
     //driver.findElement(By.cssSelector("[placeholder='Enter airport code/city']")).click();
    
     // .sendKeys("PNQ - Pune, India");
     String main=driver.getWindowHandle();
     Set<String> s=driver.getWindowHandles();
     for(String c:s)
     {
    	 if(!(main.equals(c)))
    	 {
    		 driver.switchTo().window(c);
    		
    		 //Select s2=new Select(d);
    	      //s2.selectByVisibleText("BOM - Mumbai, India");
    	 }
     }
     Actions act=new Actions(driver);
     act.scrollByAmount(0, 1500);
    // act.keyDown(Keys.CONTROL).sendKeys("BOM - Mumbai, India").perform();
      
	}

}
