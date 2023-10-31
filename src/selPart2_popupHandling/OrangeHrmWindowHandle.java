package selPart2_popupHandling;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmWindowHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ashutosh\\Desktop\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		String s=driver.getWindowHandle();
		String expectedTitle="actiTIME - Time Tracking Software";
		Set<String> all=driver.getWindowHandles();
		for(String d:all)
		{
			
			String act=driver.switchTo().window(d).getTitle();
			//if(!(s.equals(d)))
			
				if(act.contains(expectedTitle))
			{
				//driver.switchTo().window(d);
					break;
			}
		}
		System.out.println(driver.getTitle());

	}

}
