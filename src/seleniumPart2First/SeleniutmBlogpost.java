package seleniumPart2First;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniutmBlogpost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium08.blogspot.com/2019/12/right-click.html");
		//WebElement sh=driver.findElement(By.id("sharing-button-Blog1-byline-6204184301960861262"));
		//WebElement sh=driver.findElement(By.className("post-share-buttons-bottom"));
		WebElement sh=driver.findElement(By.xpath("//button[contains(@id,'sharing-button-Blog1-byline')]"));
		Actions act=new Actions(driver);
		act.moveToElement(sh).doubleClick().perform();
	}

}
