package javaScriptAndKeyboardHandling;


import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actisetting {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.actitime.com/");
		String s=driver.getWindowHandle();
		System.out.println(s);
		driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.TAB,Keys.TAB,Keys.SPACE,Keys.ENTER);
		driver.findElement(By.xpath("//div[contains(@class,'popup_menu_button_settings ')]")).click();
		driver.findElement(By.xpath("//a[text()='Types of Work']")).click();
		driver.findElement(By.xpath("//span[text()='Create Type of Work']")).click();
	
		driver.findElement(By.name("name")).sendKeys("kumar");
		driver.findElement(By.xpath("//input[@id='billingRate_input']")).sendKeys("122",Keys.TAB);
		//driver.findElement(By.cssSelector("button.close-icon")).click();
		
       
       


}
}

