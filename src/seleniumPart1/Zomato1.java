package seleniumPart1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Zomato1 {
       WebDriver driver;
       public static void main(String[] args) throws InterruptedException {
			Zomato1 zo=new Zomato1();
			zo.launchBrowser();
			zo.ironhillRestaurent();
			String result=zo.rating();
			zo.closeBrowser();
		}
			
			public void launchBrowser() {
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			}
			
			public void ironhillRestaurent()throws InterruptedException {
			driver.get("https://www.zomato.com/india");
			driver.findElement(By.xpath("//h5[text()='Bengaluru Restaurants']")).click();  ///visible text bengalure
			Thread.sleep(2000);
			//driver.findElement(By.xpath("//div[text()='Rating: 4.0+']")).click();
			driver.findElement(By.className("pill_rating_range")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[contains(text(),'Dining Out')]")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//h4[text()='Ironhill Bengaluru']")).click();
			Thread.sleep(2000);
			}
			
			public String rating() {
			    //String result=driver.findElement(By.xpath("//div[@class='sc-1q7bklc-5 kHxpSk']")).getText();
			    String result=driver.findElement(By.xpath("//div[text()='Dining Reviews']/../..")).getText();
			    System.out.println(result);
			    
			    //String result1=driver.findElement(By.xpath("//div[text()='Dining Reviews']")).getText();
			    //System.out.println(result1);
			    return result;
			}
			public void closeBrowser()
			{
				driver.close();
			}


}
