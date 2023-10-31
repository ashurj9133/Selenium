package seleniumPart1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TileAmazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
	      driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile");
	      driver.findElement(By.id("nav-search-submit-button")).click();
	      System.out.println("Title:"+ driver.getTitle());
//	      driver.findElement(By.id("keepLoggedInCheckBoxContainer")).click();
//	      driver.findElement(By.id("loginButton")).click();
	}

}
