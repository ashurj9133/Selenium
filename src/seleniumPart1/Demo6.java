package seleniumPart1;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       WebDriver driver=new ChromeDriver();
       driver.get("https://www.ebay.com");
       Thread.sleep(2000);
       driver.get("https://www.selenium.dev/");
       Thread.sleep(2000);
       driver.navigate().back();
       Thread.sleep(2000);
       System.out.println("Title: "+ driver.getTitle());
       System.out.println("url:"+ driver.getCurrentUrl());
       System.out.println("Position: "+driver.manage().window().getPosition());
       System.out.println("Size: "+driver.manage().window().getSize());
       driver.navigate().forward();
       Thread.sleep(2000);
       driver.manage().window().setPosition(new Point(400,300));
}
}