package advanceSel;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook1 {

		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\ashutosh\\Desktop\\Selenium\\Drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://www.facebook.com/signup");
			WebElement day = driver.findElement(By.id("day"));
			WebElement month = driver.findElement(By.id("month"));
			WebElement year = driver.findElement(By.id("year"));
			Select daydropdown =new Select(day);//using select class
			daydropdown.selectByIndex(8);// ref of select class . method of select class
			Select monthdropdown =new Select(month);
			monthdropdown.selectByValue("12");
			Select yeardropdown =new Select(year);
			yeardropdown.selectByVisibleText("1994");// it is written in black 

			
			WebElement days = driver.findElement(By.id("day"));
			WebElement months = driver.findElement(By.id("month"));
			WebElement years = driver.findElement(By.id("year"));
			System.out.print(days.getText()+" "+months.getText()+" "+years.getText());	
			

	}

}

