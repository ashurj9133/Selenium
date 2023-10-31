package seleniumPart1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dunzo {
       WebDriver driver;
       public static void main(String[]args) throws InterruptedException {
    	   Dunzo d=new Dunzo();
    	   d.launchBrowser();
    	   d.fetchProduct();
       }   
       public void launchBrowser()
       {
    	   driver=new ChromeDriver();
    	   driver.get("https://www.dunzo.com/bangalore");
    	   driver.manage().window().maximize();
       }
       public void fetchProduct() throws InterruptedException
       {
    	   driver.findElement(By.xpath("//p[text()='Search']")).click();
    	   Thread.sleep(2000);
    	   //driver.findElement(By.xpath("//p[text()='Set Location']")).sendKeys("Bengaluru");
    	  // Thread.sleep(2000);
    	   //driver.findElement(By.xpath("//p[text()='Search']")).click();
    	  // driver.findElement(By.xpath("[placeholder='Search for item or a store']")).sendKeys("HUFT Biodegradable Pet Wipes");
    	   driver.findElement(By.cssSelector(".sc-fznZeY.jRsRRC")).sendKeys("pet food");
    	   Thread.sleep(2000);
    	   //driver.findElement(By.cssSelector(".sc-fznZeY.jRsRRC")).sendKeys("pet food");
    	   
       }

}