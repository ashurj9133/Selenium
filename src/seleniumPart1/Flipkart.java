package seleniumPart1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	WebDriver driver;
	
	public static void main(String[]args) throws InterruptedException {
		Flipkart f=new Flipkart();
		f.loginBrowser();
		f.fetchProduct();
		f.closeBrowser();
	}
	public void loginBrowser()
	{
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	}
	public void fetchProduct() throws InterruptedException
	{
		try {
       driver.findElement(By.xpath("//button[text()='✕']")).click();
		}
		catch(Exception e)
		{
			
		}
		driver.findElement(By.name("q")).sendKeys("iphonex");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[type='submit']")).click();
		Thread.sleep(2000);
		String dr=driver.findElement(By.xpath("//div[text()='APPLE iPhone X (Silver, 64 GB)']/../../div[2]/div[1]/div[1]/div[1]")).getText();
		System.out.println(dr);
     }
	public void closeBrowser()
	{
		//driver.close();
	}
}
