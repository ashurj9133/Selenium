package seleniumPart2First;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dropdown {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
	      driver.get("https://demo.actitime.com/login.do");
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	      driver.findElement(By.id("username")).sendKeys("admin");
	      driver.findElement(By.name("pwd")).sendKeys("manager");
	      driver.findElement(By.id("keepLoggedInCheckBoxContainer")).click();
	      driver.findElement(By.id("loginButton")).click();
	      driver.findElement(By.xpath("//div[contains(@class,'popup_menu_button_settings')]")).click();
	      driver.findElement(By.xpath("//div[text()='Manage system settings & configure actiTIME']")).click();
	   //driver.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[7]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/div[2]/div/div[1]/div/div")).click();
	   
	   
	   WebElement pop=driver.findElement(By.id("firstHierarchyLevelCodeSelect"));
	   
	   
	   Select s=new Select(pop);
	   s.selectByValue("3");
	   WebElement res=driver.findElement(By.xpath("//td[text()='MODIFICATIONS NOT SAVED']"));
	   File src=res.getScreenshotAs(OutputType.FILE);
	   File trg=new File("C:\\Users\\ashutosh\\Desktop\\Selenium\\Selenium01\\src\\screenshot\\modify.png");
	   FileHandler.copy(src,trg);
	   
	   
	}
}
