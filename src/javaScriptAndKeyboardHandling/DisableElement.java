package javaScriptAndKeyboardHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisableElement {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.oracle.com/in/java/technologies/downloads/");
		driver.findElement(By.linkText("jdk-8u381-linux-x64.rpm")).click();
	WebElement demo=driver.findElement(By.linkText("Download jdk-8u381-linux-x64.rpm"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();",demo);
	}

}
