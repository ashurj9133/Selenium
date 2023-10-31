package anonymousAssinment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Zlink {
    public static void main(String[]args) throws InterruptedException
    {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\ashutosh\\Desktop\\Selenium\\Drivers\\chromedriver.exe");
    	ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://zlink-web.minervaiotdev.com/zlink/login");
		driver.findElement(By.name("userName")).sendKeys("kanhugouda79@gmail.com");
		driver.findElement(By.cssSelector("[placeholder='Enter your Password']")).sendKeys("Kanhu143@");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		driver.findElement(By.xpath("//p[text()='Zlink_Syst...']")).click();
		driver.findElement(By.xpath("(//button[@type='button'])[5]")).click();
		driver.findElement(By.xpath("//span[text()='Organization']")).click();
		driver.findElement(By.xpath("//*[name()='svg' and @aria-label='Add']")).click();


    }
}

                                                  



    