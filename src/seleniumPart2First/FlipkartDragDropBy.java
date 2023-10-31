package seleniumPart2First;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipkartDragDropBy {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		try {
		       driver.findElement(By.xpath("//button[text()='✕']")).click();
				}
				catch(Exception e)
				{
					
				}
		driver.findElement(By.name("q")).sendKeys("mobiles",Keys.ENTER);
		WebElement slide1=driver.findElement(By.xpath("(//div[contains(@class,'FdLqY')])[1]"));
		Actions act=new Actions(driver);
		act.dragAndDropBy(slide1, 60, 0).perform();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Clear all']")));
		WebElement slide2=driver.findElement(By.xpath("(//div[contains(@class,'FdLqY')])[2]"));
		act.dragAndDropBy(slide2, -60, 0).perform();
		
	}

}
