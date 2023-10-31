package seleniumPart2First;

import java.time.Duration;
import java.util.List;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/ashutosh/Downloads/country_dropdown.html");
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	      WebElement list=driver.findElement(By.id("Country"));
	      Select s=new Select(list);
	      s.selectByIndex(1);
	      List<WebElement>  pop=s.getOptions();
	      System.out.println(pop.size());
	      System.out.println(s);
	      System.out.println(list.getText());
	    //or,  for(WebElement opt:pop)
	     // {
	    	//  System.out.println(opt.getText());
	      //}
 	}

}
