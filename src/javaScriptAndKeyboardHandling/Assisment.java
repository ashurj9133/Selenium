package javaScriptAndKeyboardHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assisment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.actitime.com/login.do");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        System.out.println("Title: "+driver.getTitle());
        //driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.TAB,Keys.TAB,Keys.SPACE,Keys.ENTER);
        System.out.println("Title1: "+driver.getTitle());
        driver.findElement(By.id("username")).sendKeys("admin");
        Actions act=new Actions(driver);
        act.keyUp(Keys.CONTROL).perform();
        driver.findElement(By.name("pwd")).sendKeys("manager",Keys.TAB,Keys.TAB,Keys.SPACE,Keys.ENTER);
        System.out.println("Title2: "+driver.getTitle());
	}

}
