package seleniumPart1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CoronavirusDetails {

	
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.google.com/");
			driver.findElement(By.id("APjFqb")).sendKeys("computer");
			Thread.sleep(2000);
			
			//driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@name='btnK']")).click();
			driver.findElement(By.name("btnK")).click();
			//driver.findElement(By.className("gNO89b")).click();
			
			String res=driver.findElement(By.id("result-stats")).getText();
			   System.out.println(res);
	}

}

