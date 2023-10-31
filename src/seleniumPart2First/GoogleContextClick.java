package seleniumPart2First;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GoogleContextClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		WebElement d=driver.findElement(By.xpath("//a[text()='Gmail']"));
	   Actions act=new Actions(driver);
	   act.moveToElement(d).contextClick().perform();
	   act.contextClick(d).perform();
	   //act.
	}

}
