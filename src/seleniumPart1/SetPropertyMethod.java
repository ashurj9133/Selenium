package seleniumPart1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SetPropertyMethod {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//configure browser server
	 //System.setProperty("webdriver.chrome.driver","C:\\Users\\ashutosh\\Desktop\\Selenium\\Drivers\\chromedriver.exe");
	 //launching the browser
     ChromeDriver driver=new ChromeDriver();
     //open google
     //driver.get("https://www.flipkart.com");                                                                                                                                                                                                                                                                                                                                                                                                                             
      driver.navigate().to("http:\\www.flipkart.com");
      driver.navigate().forward();
     String title=driver.getTitle();
     System.out.println("page Title: "+ title);
     System.out.println("URL:"+driver.getCurrentUrl());
      
	}

}
