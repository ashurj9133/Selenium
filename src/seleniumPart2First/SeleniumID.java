package seleniumPart2First;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumID {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ashutosh\\Desktop\\Selenium\\Drivers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		List<WebElement> li=driver.findElements(By.xpath("//img"));
		for(WebElement l:li)
		{
			System.out.println(l.getAttribute("src"));
		}
	}

}
