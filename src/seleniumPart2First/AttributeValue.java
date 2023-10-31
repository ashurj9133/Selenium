package seleniumPart2First;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AttributeValue {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ashutosh\\Desktop\\Selenium\\Drivers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement dr=driver.findElement(By.id("username"));
		//System.out.println("v: "+dr.getAttribute(""));
        Rectangle rect=dr.getRect();
      //System.out.println("x cordinate: "+rect.getX());
		System.out.println("x cordinate: "+dr.getRect());
	   
	}

}
