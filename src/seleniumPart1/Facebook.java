package seleniumPart1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ashutosh\\Desktop\\Selenium\\Drivers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
	      driver.get("https://www.facebook.com/");
	      WebElement name=driver.findElement(By.cssSelector("[placeholder='Email address or phone number']"));
	      name.sendKeys("ashutosh");
	      String value=name.getAttribute("value");
	      System.out.println(value);
		
		
	}

}
