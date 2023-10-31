package seleniumPart1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zomato {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       WebDriver driver=new ChromeDriver();
       driver.get("https://www.zomato.com/india");
       Thread.sleep(2000);
       driver.findElement(By.xpath("(//div[@class='sc-bke1zw-1 fTtEw'][3])")).click();
       //driver.findElement(By.cssSelector("(.hwWMGJ)")).click();
       driver.findElement(By.cssSelector(".pill_undefined")).click();
       //Thread.sleep(2000);
       driver.findElement(By.xpath("//p[normalize-space()='Rating']")).click();
       
       
       Thread.sleep(2000);
       driver.findElement(By.cssSelector(".sc-dRCTWM.chDwvL.pill_rating_range")).click();
       
       Thread.sleep(2000);
       driver.findElement(By.xpath("//hr[contains(@class,'cdVGts')]")).click();
	}

}
