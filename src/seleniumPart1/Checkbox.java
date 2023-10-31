package seleniumPart1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
	      driver.get("https://demo.actitime.com/login.do");
	      
	      WebElement d=driver.findElement(By.id("keepLoggedInCheckBox"));
	     
		if(d.isSelected())  
		{
			System.out.println("it is already selected");
		}
		else
		{
			d.click();
			System.out.println(" now it is selected");
			String title=d.getAttribute("title");
		     System.out.println(title);
		}
	    

	
	
	}
}
