package seleniumPart1;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      WebDriver driver=new ChromeDriver();
      driver.get("https://www.google.com/");
      //WebElement loc=driver.findElement(By.id("APjFqb"));
      WebElement loc=driver.findElement(By.xpath("//a[text()='Gmail']"));
      Point p=loc.getLocation();
      Dimension size=loc.getSize();
      System.out.println("size: "+size+" location: "+p);
	}

}
