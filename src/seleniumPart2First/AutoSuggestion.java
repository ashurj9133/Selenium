package seleniumPart2First;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.NavigableSet;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("selenium");
		Thread.sleep(2000);
		List<WebElement> elements=driver.findElements(By.xpath("//div[@class='erkvQe']//li"));
	for(int i=elements.size()-1;i>=0;i--)
		{
			System.out.println(elements.get(i).getText());
		}
    }
}

	

