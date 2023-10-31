package scroll;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;

public class ScrollfromOringin {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.findElement(By.xpath("//span[text()='Documentation']")).click();
		driver.findElement(By.id("m-documentationwebdriver")).click();
WebElement scroll=driver.findElement(By.id("td-section-nav"));
ScrollOrigin sc=ScrollOrigin.fromElement(scroll);
Actions act=new Actions(driver);
act.scrollFromOrigin(sc, 0, 150).perform();
	}

}
