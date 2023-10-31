package javaScriptAndKeyboardHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GoogleTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     WebDriver driver=new ChromeDriver();
     driver.get("https://www.google.com/");
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     driver.findElements(By.id("APjFqb"));
     Actions act=new Actions(driver);
     act.keyDown(Keys.SHIFT).sendKeys("selenium").perform();
     act.keyUp(Keys.SHIFT).perform();
     act.keyDown(Keys.SHIFT).sendKeys(" web driver").perform();
     act.keyUp(Keys.SHIFT).perform();
     act.keyDown(Keys.ENTER).perform();
     act.keyUp(Keys.CONTROL).perform();
     System.out.println("Title: "+driver.getTitle());
	}

}
