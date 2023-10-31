package scroll;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollbyElement {
    //browser ke webelement level scrolling
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		//WebElement news=driver.findElement(By.xpath("//h2[text()='News']"));
		WebElement news=driver.findElement(By.xpath("//h2[text()='Donate to Selenium']"));
		Actions act=new Actions(driver);
		act.scrollToElement(news).perform();
	}

}
