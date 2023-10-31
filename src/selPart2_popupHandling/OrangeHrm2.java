package selPart2_popupHandling;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OrangeHrm2  {

		public static void main(String[] args){
			System.setProperty("webdriver.chrome.driver","C:\\Users\\ashutosh\\Desktop\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//div[@class='orangehrm-login-footer-sm']/a")).click();
		
		String mainId=driver.getWindowHandle();
		 Set<String> allId= driver.getWindowHandles();
		 for(String id:allId) {
		 if(!(mainId.equals(id)))
		 {
			 driver.switchTo().window(id);
			 driver.close();
		 }
		 }
		 driver.switchTo().window(mainId);
		 String mainPageUrl= driver.getCurrentUrl();
	     System.out.println(mainPageUrl);

		}

	}

	
		
	
		
