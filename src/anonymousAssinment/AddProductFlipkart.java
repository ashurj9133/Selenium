package anonymousAssinment;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AddProductFlipkart {
public static void main(String[]args) throws InterruptedException
{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.flipkart.com/");
	try {
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
	}
	catch(Exception e)
	{}
	driver.findElement(By.name("q")).sendKeys("mobiles",Keys.ENTER);
	driver.findElement(By.xpath("//div[text()='Relevance']")).click();
	driver.findElement(By.xpath("//div[text()='SAMSUNG Galaxy F13 (Nightsky Green, 64 GB)']")).click();
	
	String se=driver.getWindowHandle();
	Set<String> st=driver.getWindowHandles();
	for(String d:st)
	{
		if(!(se.equals(d)))
		{
			driver.switchTo().window(d);
			driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
			driver.close();
			
		}
	}
		driver.switchTo().window(se);
	driver.findElement(By.xpath("//div[text()='SAMSUNG Galaxy F04 (Jade Purple, 64 GB)']")).click();
	
	Set<String> st1=driver.getWindowHandles();
	for(String c:st1)
	{
		if(!(se.equals(c)))
		{
			driver.switchTo().window(c);
			driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
			driver.close();
			
		}
	}
	
	driver.switchTo().window(se);
	//Thread.sleep(3000);
	driver.findElement(By.xpath("//div[text()='SAMSUNG Galaxy F13 (Waterfall Blue, 64 GB)']")).click();
	Set<String> st2=driver.getWindowHandles();
	for(String q:st2)
	{
		if(!(se.equals(q)))
		{
			driver.switchTo().window(q);
			driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
			driver.close();
			
		}
	}
	driver.switchTo().window(se);
	driver.findElement(By.xpath("//span[text()='Cart']")).click();
	 //product details 
List<WebElement> productlist1 =driver.findElements(By.xpath("//a[contains(@class,'gBNbID')]"));
//product price
List<WebElement> productlist2 =driver.findElements(By.xpath("//span[text()='₹'][2]"));
for (int i = 0; i < productlist1.size(); i++) {
    WebElement product = productlist1.get(i);
    WebElement price = productlist2.get(i);

    System.out.println("Product Name: " + product.getText());
    System.out.println("Product Price: " + price.getText());
    System.out.println();
}
}
}
