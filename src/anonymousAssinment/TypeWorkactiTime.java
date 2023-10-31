package anonymousAssinment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TypeWorkactiTime {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		   driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			 driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
	      driver.findElement(By.name("pwd")).sendKeys("manager");
	      driver.findElement(By.id("keepLoggedInCheckBoxContainer")).click();
	      driver.findElement(By.id("loginButton")).click();
	      driver.findElement(By.xpath("//div[contains(@class,'popup_menu_button_settings ')]")).click();
			driver.findElement(By.xpath("//a[text()='Types of Work']")).click();
			driver.findElement(By.xpath("//span[text()='Create Type of Work']")).click();
		
			driver.findElement(By.name("name")).sendKeys("ashutosh");
			driver.findElement(By.xpath("//input[@id='billingRate_input']")).sendKeys("122",Keys.TAB);
	}

}
