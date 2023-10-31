package seleniumPart1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIde {
	WebDriver driver;
	public static void main(String[] args) {
		SeleniumIde s=new SeleniumIde();
		s.loginBrowser();
		s.fetchSeleniumIde();
		s.closeBrowser();
	}
	public void loginBrowser()
	{
	        driver=new ChromeDriver();
	      driver.get("https://www.selenium.dev/");
	}
	public void fetchSeleniumIde()
	{
	    WebElement c=driver.findElement(By.xpath("//h4[text()='Selenium IDE']"));
	    System.out.println("Color: "+c.getCssValue("color"));
	    System.out.println("Font: "+c.getCssValue("font"));
	    System.out.println("Location: "+c.getLocation());
	    System.out.println("Size: "+c.getSize());
	}
	public void closeBrowser()
	{
		driver.close();
	}
}
