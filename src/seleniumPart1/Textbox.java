package seleniumPart1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      WebDriver driver=new ChromeDriver();
      driver.get("https://demo.actitime.com/login.do");
      WebElement name=driver.findElement(By.id("username"));
      WebElement name1=driver.findElement(By.name("pwd"));
      name.sendKeys("admin");
      name1.sendKeys("manager");
      System.out.println("Name: "+name.getAttribute("id"));
      System.out.println("Password: "+name1.getAttribute("value"));
      //System.out.println("ashu: "+driver.findElement(By.name("pwd")).getAttribute("value"));
	}

}
