package selPart2_popupHandling;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShopeerStack {

    public static void main(String[] args) {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\ashutosh\\Desktop\\Selenium\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://shoppersstack.com/products_page/91");

        driver.findElement(By.name("compare")).click();
       // String mainId = driver.getWindowHandle();
        Set<String> allid = driver.getWindowHandles();
//
//        String amazonWindowUrl = null;
//
//        // Loop through all window handles and store the URL of the amazonWindow if found
//        for (String id : allid) {
//            if (!mainId.equals(id)) {
//                driver.switchTo().window(id);
//                if (driver.getTitle().contains("Amazon")) {
//                    amazonWindowUrl = driver.getCurrentUrl();
//                    driver.close();
//                    break;
//                }
//            }
//        }
//        // Switch back to the main window and perform any other actions if needed
//        driver.switchTo().window(mainId);
//
//        // Print the URL of amazonWindow if found
//        System.out.println("URL of amazonWindow: " + amazonWindowUrl);
        for(String id:allid)
        {
        	driver.switchTo().window(id);
        	String d=driver.getTitle();
        	if(d.contains("Amazon.in"))
        	{
        		driver.close();
            }
        }
    }
}
