package anonymousAssinment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elements {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\ashutosh\\\\Desktop\\\\Selenium\\\\Drivers\\\\chromedriver.exe");
       ChromeDriver driver=new ChromeDriver();
       driver.get("https://www.selenium.dev/");
       //List<WebElement> table=driver.findElements(By.xpath("//table"));
       //System.out.println(table.size());
       
       try {
       WebElement tab=driver.findElement(By.xpath("//table"));
       System.out.println(tab);
       }
       catch(Exception e)
       {}
	}

}
