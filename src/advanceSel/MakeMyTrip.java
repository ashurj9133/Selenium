package advanceSel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MakeMyTrip {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\ashutosh\\Desktop\\Selenium\\Drivers\\chromedriver.exe");
          WebDriver driver=new EdgeDriver();
          driver.manage().window().maximize();
          driver.get("https://www.makemytrip.com/");
          Actions act=new Actions(driver);
          act.moveByOffset(10, 10).click().perform();
          driver.findElement(By.xpath("//label[@for='fromCity']")).click();
          driver.findElement(By.xpath("//p[text()='Bengaluru, India']")).click();
          driver.findElement(By.xpath("//label[@for='toCity']")).click();
          driver.findElement(By.xpath("//p[text()='Hyderabad, India']")).click();
          Thread.sleep(1000);
//          for (int x = 1; x < 4; x++) {
//              Thread.sleep(1000);
//              driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
//              Thread.sleep(1000);
//
//              
//            	  if (driver.getPageSource().contains("December 2023")) {
//            		  
//                  
//                  driver.findElement(By.xpath("//div[@aria-label='Fri Dec 08 2023']")).click();
//                  break;
//  			}
//  		}
        
          int maxAttempts = 10; // Maximum number of attempts to find and select the date
          int attempts = 0;

          while (attempts < maxAttempts) {
              try {
                  // Click the "Next Month" button
                  driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
                  Thread.sleep(1000); // Add a short delay for the page to update

                  // Check if "December 2023" is displayed
                  WebElement dec2023 = driver.findElement(By.xpath("//div[text()='December 2023']"));
                  //WebElement dec2023 = driver.findElement(By.xpath("//div[text()= 'December']/span"));// this code is not working 

                  if (dec2023.isDisplayed()) {
                      // Click on "December 2023"
                      dec2023.click();
                      Thread.sleep(1000); // Add a short delay for the page to update

                      // Click on "Fri Dec 08 2023" (or the desired date)
                      driver.findElement(By.xpath("//div[@aria-label='Fri Dec 08 2023']")).click();
                      break; // Exit the loop if the date is found and selected
                  }
              } catch (Exception e) {
                  // Handle any exceptions or continue to the next month
              }

              attempts++;
          }
          driver.findElement(By.xpath("//span[text()='Return']/parent::label")).click();

         
          while (true) {
              try {
                  // Check if February 2024 is visible
            	  driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
                  WebElement feb2024 =driver.findElement(By.xpath("//div[text()= 'January']/span"));
                  
                  if (feb2024.isDisplayed()) {
                      // Click on "February 2024"
                      feb2024.click();
                      
                      // Click on "Fri Feb 09 2024" (or the desired date)
                      driver.findElement(By.xpath("//div[@aria-label='Fri Feb 09 2024']")).click();
                      break;
                  }
              } catch (Exception e) {
                  
                  
              }
          }
          //to book passenger
          driver.findElement(By.xpath("//label[@for='travellers']")).click();
          driver.findElement(By.xpath("//p[@data-cy='adultRange']/following-sibling::ul/li[@data-cy='adults-4']")).click();
          //for children
          driver.findElement(By.xpath("//p[@data-cy='childrenRange']/following-sibling::ul/li[@data-cy='children-1']")).click();
          //for infants
          driver.findElement(By.xpath("//p[@data-cy='infantRange']/following-sibling::ul/li[@data-cy='infants-1']")).click();
          driver.findElement(By.xpath("//li[@data-cy='travelClass-2']")).click();
          driver.findElement(By.xpath("//button[text()='APPLY']")).click();
	}

}
