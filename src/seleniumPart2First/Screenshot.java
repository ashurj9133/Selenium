package seleniumPart2First;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com//");
		driver.findElement(By.className("lnXdpd")).click();
		//Thread.sleep(5000);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File f=ts.getScreenshotAs(OutputType.FILE);
		File f1=new File("C:\\Users\\ashutosh\\Desktop\\Selenium\\Selenium01\\src\\screenshot\\shad.png");
		FileHandler.copy(f,f1);
	}

}
