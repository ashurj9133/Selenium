package selPart2_popupHandling;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalenderZone {
		public static void main(String[] args) {
			
			WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.get("https://jqueryui.com/datepicker/");
	        driver.switchTo().frame(0);
	        
	       driver.findElement(By.id("datepicker")).click();
	       //date.click
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ui-datepicker-div")));
String month=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
String year=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();	    	 
while(!(month.equals("July")&& year.equals("2020")))   	
{

	driver.findElement(By.xpath("//a[@data-handler='prev']")).click(); 
month=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
year=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
	
}

driver.findElement(By.xpath("//td[@data-handler='selectDay']/a[text()='20']")).click();

	}

}
