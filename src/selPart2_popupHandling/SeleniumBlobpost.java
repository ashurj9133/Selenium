package selPart2_popupHandling;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class SeleniumBlobpost {

	public static void main(String[] args) throws IOException {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(opt);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://selenium08.blogspot.com/2019/11/selenium-iframe.html");
        driver.switchTo().frame(0);
      driver.findElement(By.partialLinkText("Free Mock")).click();
 String first=driver.getWindowHandle();
 Set<String> second=driver.getWindowHandles();
 for(String id:second)
 {
	if(!(first.equals(id))) {
		driver.switchTo().window(id); 
	}
 }
   WebElement demo= driver.findElement(By.xpath("//*[@id='all-exams-id']"));
    Actions ac=new Actions(driver);
    ac.moveToElement(demo).perform();
    driver.findElement(By.linkText("Banking")).click();
  driver.findElement(By.linkText("SBI Clerk Prelims")).click();
  WebElement dr=driver.findElement(By.xpath("//a[text()='Buy Now']"));
  
 // TakesScreenshot ts=(TakesScreenshot)driver;
  File f=dr.getScreenshotAs(OutputType.FILE);
  File ft=new File("C:\\Users\\ashutosh\\Desktop\\Selenium\\Selenium01\\src\\screenshot\\sb.png");
  FileHandler.copy(f,ft);
    
	}

}
