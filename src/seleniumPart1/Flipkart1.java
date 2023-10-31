package seleniumPart1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart1 {
	WebDriver driver;
	
	public static void main(String[]args) throws InterruptedException {
		String productname="APPLE iPhone X (Silver, 64 GB)";
		Flipkart1 f=new Flipkart1();
		f.loginBrowser();
		String price=f.fetchProduct(productname);
		System.out.println("Price: "+price);
		f.closeBrowser();
	}
	public void loginBrowser()
	{
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	}
	public String fetchProduct(String productname) throws InterruptedException
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
		String price=driver.findElement(By.xpath("//div[text()='"+productname+"']/../../div[2]/div[1]/div[1]/div[1]")).getText();
		//System.out.println(dr);
		return price;
     }
	public void closeBrowser()
	{
		driver.close();
	}
}
