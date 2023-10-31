package seleniumPart1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbayCameraGetText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.findElement(By.id("gh-ac")).sendKeys("camera");
		driver.findElement(By.id("gh-btn")).click();
		String res=driver.findElement(By.className("srp-controls__count-heading")).getText();
        System.out.println(res);
	}

}
