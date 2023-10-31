package anonymousAssinment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindDropdown {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ashutosh\\Desktop\\Selenium\\Drivers\\chromedriver.exe");
     ChromeDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("C:\\Users\\ashutosh\\Downloads\\country_dropdown.html");
		WebElement dropdown=driver.findElement(By.id("Country"));
		dropdown.click();
		driver.findElement(By.xpath("//option[text()='  India ']")).click();
		dropdown.click();
	}

}
