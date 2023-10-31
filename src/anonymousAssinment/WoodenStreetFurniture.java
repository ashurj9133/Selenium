package anonymousAssinment;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WoodenStreetFurniture {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.woodenstreet.com/");
		try {
		driver.findElement(By.xpath("//div[contains(@id,'loginclose')]")).click();
		}
		catch(Exception e)
		{}
		WebElement wb=driver.findElement(By.xpath("//a[text()='Dining & Kitchen']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(wb).click().perform();
		
		driver.findElement(By.xpath("//a[text()='Dining & Kitchen']")).click();
		driver.findElement(By.xpath("//div[@class='top-list']/a[4]")).click();

		driver.findElement(By.xpath("(//p[text()=' Add to Cart'])[1]")).click();
		driver.findElement(By.xpath("(//p[text()=' Add to Cart'])[2]")).click();
		driver.findElement(By.xpath("(//p[text()=' Add to Cart'])[3]")).click();
		driver.findElement(By.id("cart-total")).click();
		 //product details 
 List<WebElement> productlist1 =driver.findElements(By.xpath("//a[@class='product-name']"));
 //product price
 List<WebElement> productlist2 =driver.findElements(By.xpath("//strong[contains(text(),'Rs ')]"));
    	
 for (int i = 0; i < productlist1.size(); i++) {
	    WebElement product = productlist1.get(i);
	    WebElement price = productlist2.get(i);

	    System.out.println( price.getText()+" "+ product.getText());
	  //  System.out.println("Product Price: " + price.getText());
	    System.out.println();
	}
    

	
	}
}