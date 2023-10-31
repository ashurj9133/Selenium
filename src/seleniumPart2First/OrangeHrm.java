package seleniumPart2First;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class OrangeHrm {

	public static void main(String[] args) throws IOException, AWTException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.orangehrm.com/");
		
		
  driver.findElement(By.xpath("//div[@id='navbarSupportedContent']//ul/following-sibling::div[2]//ul//li[2]//a/button")).click();
  //driver.findElement(By.xpath("//button[@class='btn btn-ohrm btn-free-demo'])[2]"));
  Robot r=new Robot();
  r.keyPress(KeyEvent.VK_PAGE_DOWN);
  r.keyRelease(KeyEvent.VK_PAGE_DOWN);
//     JavascriptExecutor js=(JavascriptExecutor)driver;
//     js.executeScript("window.scrollBy(0,100)");
    driver.findElement(By.id("Form_getForm_FullName")).sendKeys("ashutosh");
    driver.findElement(By.id("Form_getForm_Contact")).sendKeys("123456789");
    driver.findElement(By.id("Form_getForm_Email")).sendKeys("abc908@gmail.com");
   WebElement country= driver.findElement(By.id("Form_getForm_Country"));
    Select s=new Select(country);
    s.selectByVisibleText("India");
    WebElement Employee=driver.findElement(By.id("Form_getForm_NoOfEmployees"));
    Select ss=new Select(Employee);
    ss.selectByVisibleText("101 - 150");
    driver.findElement(By.id("Form_getForm_JobTitle")).sendKeys("Engineer");
    WebElement emp=driver.findElement(By.xpath("(//div[@class='middleColumn'])[7]")); 
   // TakesScreenshot ts=(TakesScreenshot)driver;
    File f=emp.getScreenshotAs(OutputType.FILE);
    File fs=new File("C:\\Users\\ashutosh\\Desktop\\Selenium\\Selenium01\\src\\screenshot\\orange1.png");
    FileHandler.copy(f,fs);
    
    //driver.quit();
	}

}
