package seleniumPart1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
	      driver.get("https://www.amazon.in/");
	      
	    WebElement d=driver.findElement(By.xpath("//a[text()='Mobiles']"));
	     
		if(d.isDisplayed())  
		{
			System.out.println("it is already displayed");
		}
		else
		{
			//d.click();
			System.out.println(" not it is displayed");
		}
	}

}
