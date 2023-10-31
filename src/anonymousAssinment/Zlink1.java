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

	public class Zlink1 {
	    public static void main(String[]args) throws InterruptedException
	    {
	    	System.setProperty("webdriver.chrome.driver","C:\\Users\\ashutosh\\Desktop\\Selenium\\Drivers\\chromedriver.exe");
	    	ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://zlink-web.minervaiotdev.com/zlink/signup");
			driver.findElement(By.name("firstName")).sendKeys("kanhu");
			driver.findElement(By.name("lastName")).sendKeys("gowda");
			driver.findElement(By.name("email")).sendKeys("gowda@gmail.com");
	//WebElement drop=driver.findElement(By.cssSelector("[title='Open']"));
//	WebElement drop=driver.findElement(By.cssSelector("[placeholder='Select your Country']"));
//	drop.click();
//	
//	for (int i = 0; i < 99; i++) {
//	    drop.sendKeys(Keys.ARROW_DOWN);
//	}
//	drop.sendKeys(Keys.ENTER);
			
			WebElement drop=driver.findElement(By.xpath("//div[contains(@class,'MuiFormControl-root')]//input[@placeholder='Select your Country']"));
   drop.click();
  
   Actions actions = new Actions(driver);

// Press the down arrow key 99 times
for (int i = 0; i < 99; i++) {
    actions.sendKeys(Keys.ARROW_DOWN).build().perform();
}
actions.sendKeys(Keys.ENTER).build().perform();

	driver.findElement(By.name("password")).sendKeys("G56da@gmail");
	driver.findElement(By.name("confirmPassword")).sendKeys("G56da@gmail");
}
	}