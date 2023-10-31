package seleniumPart1;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiTime {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String CustomerName="rak";
		Random r= new Random();
		int num=r.nextInt(10000);
		CustomerName=CustomerName+num;
		WebDriver driver=new ChromeDriver();
		
	      driver.get("https://demo.actitime.com/login.do");
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	      driver.findElement(By.id("username")).sendKeys("admin");
	      driver.findElement(By.name("pwd")).sendKeys("manager");
	      driver.findElement(By.id("keepLoggedInCheckBoxContainer")).click();
	      driver.findElement(By.id("loginButton")).click();
	      
	      driver.findElement(By.id("container_tasks")).click();
	      
	      driver.findElement(By.cssSelector(".title.ellipsis")).click();
	      driver.findElement(By.className("createNewCustomer")).click();
	      //driver.findElement(By.cssSelector("div[class='item createNewProject']")).click();
	      
	      
	      driver.findElement(By.className("inputNameField")).sendKeys(CustomerName);
	      driver.findElement(By.cssSelector("textarea[placeholder='Enter Customer Description']")).sendKeys("hello");
	      //click on create customer
	      driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
	      WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	      wait.until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector(".titleEditButtonContainer>.title"), CustomerName));
	      String ExpectedCustomerName=driver.findElement(By.cssSelector(".titleEditButtonContainer>.title")).getText();
	      System.out.println(ExpectedCustomerName);
	      //validating the chustomer name
	      if(CustomerName.equals(ExpectedCustomerName))
	      {
	    	  System.out.println("test case is passed");
	      }
	      else
	      {
	    	  System.out.println("Test cases is failed");
	      }
	
	      
	}
}
