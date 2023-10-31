package javaScriptAndKeyboardHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TypedText {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ashutosh\\Desktop\\Selenium\\Drivers\\chromedriver.exe");
    	ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('APjFqb').value='selenium';");
		WebElement element=driver.findElement(By.name("btnK"));
		js.executeScript("arguments[0].click();",element);
		String s=js.executeScript("return document.domain;").toString();
		System.out.println(s);
		System.out.println(js.executeScript("return document.URL").toString());
		System.out.println(js.executeScript("return document.title").toString());
		js.executeScript("window.location='https://www.flipkart.com'");
		js.executeScript("alert('ashutosh ranjan');");
		
		

	}

}
