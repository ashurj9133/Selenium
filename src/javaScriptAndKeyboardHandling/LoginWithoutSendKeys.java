package javaScriptAndKeyboardHandling;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginWithoutSendKeys {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('username').value='admin';");
		js.executeScript("document.getElementsByName('pwd')[0].value='manager';");
		js.executeScript("document.getElementById('loginButton').click()");

	}

}
