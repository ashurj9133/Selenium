package seleniumPart1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium1 {
    WebDriver driver;
    public static void main(String[]args) throws InterruptedException
    {
    	Selenium1 s=new Selenium1();
    	s.loginBrowser();
		s.fetchProduct();
		s.closeBrowser();
    }
    public void loginBrowser()
    {
    	driver=new ChromeDriver();
    	driver.get("https://www.selenium.dev/");
    	driver.manage().window().maximize();
    }
    public void fetchProduct() throws InterruptedException
    {
    	Thread.sleep(2000);
    driver.findElement(By.xpath("//span[text()='Blog']")).click();
    
    Thread.sleep(2000);
    
    driver.findElement(By.xpath("//span[text()='2023']")).click();
    driver.findElement(By.xpath("//span[text()='Selenium 4.10.0 Released!']")).click();
    Thread.sleep(2000);
    
    driver.findElement(By.xpath("//span[text()='Documentation']")).click();
    driver.findElement(By.id("m-documentationwebdriver")).click();
    
    driver.findElement(By.xpath("//span[text()='Drivers']")).click();
    driver.findElement(By.xpath("//a[text()='Options']")).click();
    driver.findElement(By.xpath("//span[text()='Browsers']")).click();
    String browser=driver.findElement(By.xpath("//h1[text()='Supported Browsers']/..//div[1]")).getText();
    System.out.println(browser);
    }
    public void closeBrowser()
    {
    	driver.quit();
    }
}
