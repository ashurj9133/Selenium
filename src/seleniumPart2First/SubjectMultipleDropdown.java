package seleniumPart2First;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SubjectMultipleDropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ashutosh\\Desktop\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	      driver.get("file:///C:/Users/ashutosh/Downloads/Subject_multipleDropdown.html");
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     WebElement dc= driver.findElement(By.id("Subject"));
	     Select s=new Select(dc);
	     
	     s.selectByVisibleText(" Java ");
	     s.selectByVisibleText("Selenium");
	     s.selectByVisibleText("Manual");
	     
	     s.deselectAll();
	     List<WebElement> all=s.getOptions();
	     for(WebElement option:all)
	     {
	    	 if(!(option.isSelected()))
	    	 {
	    		 System.out.println(option.getText());
	    	 }
	     }
	     
	     
	}

}
