package advanceSel;

import java.io.Closeable;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandl {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ashutosh\\Desktop\\Selenium\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://shoppersstack.com/products_page/91");

        driver.findElement(By.name("compare")).click();
     
        String mainWindowHandle = driver.getWindowHandle();//agr hmko phir wapas main window me jana ho to likha hoga
                                                           //kyuki niche main window me jane ka code likha hai

     // Get all window handles
     Set<String> allWindowHandles = driver.getWindowHandles();
     
     //System.out.println(allWindowHandles);
    String exptT="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
     for (String windowHandle : allWindowHandles) {
        
         String tit=driver.switchTo().window(windowHandle).getTitle();

       
         //String windowTitle = driver.getTitle();
         System.out.println("title:: "+driver.getTitle());

        
         if (tit.contains(exptT)) {
        	
        	 driver.manage().window().maximize();
        			try {
        	       driver.findElement(By.xpath("//span[text()='✕']")).click();
        			}
        			catch(Exception e)
        			{
        				
        			}
        			driver.findElement(By.name("q")).sendKeys("iphonex");
        		//driver.close();
             break;
         }
         
     }
     

     // wapas main window me jane ke liye
     //driver.switchTo().window(mainWindowHandle);
     
     
     






	}

}
