package anonymousAssinment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript {
   public static void main(String []args) {
	   String username="admin";
	   String password="manager";
	   String expectedLoginTitle="actiTIME - Login";
	   String expectedHomePageTitle="actiTIME -  Enter Time-Track";
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\ashutosh\\Desktop\\Selenium\\Drivers\\chromedriver.exe");
	   ChromeDriver driver=new ChromeDriver();
	   System.out.println("browser launched");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   //Enter url
	   driver.get("https://demo.actitime.com/login.do");
		String  title=driver.getTitle();
		if(title.equals(expectedLoginTitle))
		{
			System.out.println("login pages displayed successfully");
		}
		else
		{
			System.out.println("failed to navigate login page");
		}
	WebElement usernameTextfield=driver.findElement(By.id("username"));
    usernameTextfield.clear();
    usernameTextfield.sendKeys(username);
    String actualText=usernameTextfield.getAttribute("value");
    if(actualText.equals(username)) {
    	System.out.println("username accept successfully");
    }
    else
    {
    	System.out.println("Failed! cannot accept username");
    }
	      driver.findElement(By.name("pwd")).sendKeys("manager");
	      driver.findElement(By.id("keepLoggedInCheckBoxContainer")).click();
	      driver.findElement(By.id("loginButton")).click();
	   
   }
}
