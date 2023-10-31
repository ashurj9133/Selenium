package seleniumPart2First;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WoodenCart {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.woodenstreet.com/");
		driver.findElement(By.xpath("//p[text()='Lamps & Lightings']")).click();
		Thread.sleep(5000);
		WebElement d=driver.findElement(By.cssSelector("[title='Lamp Shades']"));
		File f=d.getScreenshotAs(OutputType.FILE);
		File f1=new File("C:\\Users\\ashutosh\\Desktop\\Selenium\\Selenium01\\src\\screenshot\\a.png");
		FileHandler.copy(f,f1);
	}

}
