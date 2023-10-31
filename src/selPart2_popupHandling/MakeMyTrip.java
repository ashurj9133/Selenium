package selPart2_popupHandling;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip{
		public static void main(String[] args) {
			WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.get("https://www.makemytrip.com/");
	        driver.switchTo().alert().dismiss();
	        //alt.dismiss();
	        driver.findElement(By.xpath("//a[@id='webklipper-publisher-widget-container-notification-close-div']")).click();
	        //driver.findElement(By.xpath("//span[text()='Flights']")).click();
	}

}
