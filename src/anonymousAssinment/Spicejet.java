package anonymousAssinment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Spicejet {
	public static WebDriver driver;
	 public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ashutosh\\Desktop\\Selenium\\Drivers\\chromedriver.exe");
		 ChromeOptions opt=new ChromeOptions();
			opt.addArguments("--disable-notifications");
			
	          driver = new ChromeDriver(opt);
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.get("https://www.spicejet.com/");
       
	        
	        WebElement rp=driver.findElement(By.xpath("//div[text()='From']"));
				        rp.click();
	        driver.findElement(By.xpath("//div[text()='Agartala']")).click();
	        driver.findElement(By.xpath("//div[text()='Chennai']")).click();
	
//	        Thread.sleep(2000);
	        int maxAttempts = 5; // Maximum number of attempts to find and select the date
	          int attempts = 0;

	          while (attempts < maxAttempts) {
	              try {
	                  // Click the "Next Month" button
	                  driver.findElement(By.xpath("(//*[name()='svg' and @data-testid='svg-img'])[16]")).click();
	                  Thread.sleep(1000); // Add a short delay for the page to update

	                  // Check if "December 2023" is displayed
	                  WebElement dec2023 = driver.findElement(By.xpath("//div[@data-testid='undefined-month-December-2023']"));
	                 

	                  if (dec2023.isDisplayed()) {
	                      // Click on "December 2023"
	                      dec2023.click();
	                      Thread.sleep(1000); // Add a short delay for the page to update

	                      // Click on "Fri Dec 08 2023" (or the desired date)
	                     // driver.findElement(By.xpath("//div[contains(@class,'css-1dbjc4n')]//div[text()='Sat, 10 Feb 2024']")).click();
	                      driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[2]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]]")).click();
	                      
	                      break; // Exit the loop if the date is found and selected
	                  }
	              } catch (Exception e) {
	                  // Handle any exceptions or continue to the next month
	              }

	              attempts++;
	          }

	       







	 }
}