package seleniumPart1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumInGoogleSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      WebDriver driver=new ChromeDriver();
      driver.get("https://www.google.com/");
      By usernameLocation=By.id("APjFqb");
      WebElement username=driver.findElement(usernameLocation);
      username.sendKeys("selenium");
    		 
	}

}
