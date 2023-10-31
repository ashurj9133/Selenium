package seleniumPart2First;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebay2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		List<WebElement> li=driver.findElements(By.xpath("//*"));
		for(WebElement l:li)
		{
			System.out.println(l.getText());
		}
	}

}
