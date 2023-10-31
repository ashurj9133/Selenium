package scroll;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;

public class ScrollFromOrigin2 {
		public static void main(String[] args) throws InterruptedException{
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.selenium.dev/");
			driver.findElement(By.xpath("//span[text()='Documentation']")).click();
			driver.findElement(By.xpath("//span[text()='WebDriver']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='Actions API']")).click();
			Actions act=new Actions(driver);
			
			driver.findElement(By.xpath("//span[text()='Mouse']")).click();
    
WebElement scroll=driver.findElement(By.xpath("//h2[@id='click-and-hold']/following-sibling::div[1]/div[1]/div[1]/div[1]/pre"));
	
ScrollOrigin sc=ScrollOrigin.fromElement(scroll);
	   act.scrollFromOrigin(sc,40,0).perform();
			
	}

}
