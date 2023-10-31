package seleniumPart1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
	      driver.get("https://demo.actitime.com/login.do");
	      WebElement box=driver.findElement(By.id("keepLoggedInLabel"));
	      String value=box.getTagName();
	      System.out.println(value);

	}

}
