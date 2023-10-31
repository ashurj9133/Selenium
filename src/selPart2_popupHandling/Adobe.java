package selPart2_popupHandling;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Adobe {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(22));
		driver.get("https://www.adobe.com/in/");
		Thread.sleep(30000);
		
		
		String l=driver.findElement(By.xpath("//div[@class='tt-modal-img']//img")).getText();
		            
		String g=driver.getWindowHandle();
		Set<String>   wh = driver.getWindowHandles(); // Handle of the main window
		for (String handle :wh) {
		    if (!(g.equals(handle))) {
		        driver.switchTo().window(handle);
		       // break;
		        l=driver.findElement(By.xpath("//div[@class='tt-modal-img']//img")).getText();
		        
		    }
		}
		   
		TakesScreenshot ts=(TakesScreenshot)driver;	
	    File f=ts.getScreenshotAs(OutputType.FILE);
	    File fr=new File("C:\\Users\\ashutosh\\Desktop\\Selenium\\Selenium01\\src\\screenshot\\file2.png");
	    FileHandler.copy(f, fr);
		
		
	}

}
