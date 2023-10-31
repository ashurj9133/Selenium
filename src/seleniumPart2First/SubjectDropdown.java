package seleniumPart2First;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SubjectDropdown {
	public static void main(String[] args) {
      WebDriver driver=new ChromeDriver();
      driver.get("file:///C:/Users/ashutosh/Downloads/subject_dropdown.html");
     WebElement dc= driver.findElement(By.id("Subject"));
     Select s=new Select(dc);
     List<WebElement> lw=s.getOptions(); 
//     Set<String> sc=new LinkedHashSet<String>();
//     for(WebElement opt:lw)
//     {
//    	sc.add(opt.getText()); 
//     }
//     List<String> al=new ArrayList(sc);
//     Collections.sort(al);
//     System.out.println(al);
     TreeSet ts=new TreeSet();   // another method
     for(WebElement opt:lw)
       {
      	ts.add(opt.getText()); 
       }
     System.out.println(ts);
     driver.quit();
	}
}
