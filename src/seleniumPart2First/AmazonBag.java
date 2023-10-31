package seleniumPart2First;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonBag {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.amazon.in/");
    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("bag");
    Thread.sleep(2000);
    List<WebElement> ds=driver.findElements(By.xpath("//div[text()='bag']/../.."));
   // ArrayList al=new ArrayList();
    for(WebElement d:ds)
    {
    	String al=d.getText();
    	System.out.println(al);
//    	if(al.contains("bag for men"))
//    	{
//    		d.click();
//    		break;
//    	}
    }
    driver.quit();
	}
}
