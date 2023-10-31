package seleniumPart2First;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ActitimeDropdown2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		  driver.get("https://demo.actitime.com/login.do");
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	      driver.findElement(By.id("username")).sendKeys("admin");
	      driver.findElement(By.name("pwd")).sendKeys("manager");
	      driver.findElement(By.id("keepLoggedInCheckBoxContainer")).click();
	      driver.findElement(By.id("loginButton")).click();
	      driver.findElement(By.xpath("//div[contains(@class,'popup_menu_button_settings')]")).click();
	      driver.findElement(By.xpath("//div[text()='Manage system settings & configure actiTIME']")).click();
         WebElement drop=driver.findElement(By.id("userGroupNamingCodeSelect"));
	      Select act=new Select(drop);
	   // Get the list of dropdown options
//	        List<WebElement> opt = act.getOptions();
//
//	        // Create a list to store the sorted options
//	        List<String> on = new ArrayList();
//
//	        // Add the options text to the sortedOptions list
//	        for (WebElement option : opt) {
//	            on.add(option.getText());
//	        }
//
//	        // Sort the options in ascending order
//	        on.sort(String::compareToIgnoreCase);
//
//	        // Print the sorted data
//	        for (String text : on) {
//	            System.out.println(text);
//	        }
	      ArrayList<String> st=new ArrayList<>();
	      List<WebElement> all=act.getOptions();
	      for(WebElement option:all)
	      {
	    	  st.add(option.getText());
	      
	      //String element=drop.getText();
	      }
	      Collections.sort(st);
	      System.out.println(st);
	      } 

	}


