package anonymousAssinment;
/*   import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import actiTimeApplication.genericLib.CommonUtility;
import actiTimeApplication.genericLib.DataUtility;

public class FirstCreateCustomer {
  public static void main(String[]args) throws EncryptedDocumentException, IOException
  {
	  DataUtility du=new DataUtility();
	  String customername=du.getDataFromExcelsheet("sheet2",0,1);
	  CommonUtility cu=new CommonUtility();
	  int num=cu.getRandomNum();
	  customername=customername+num;
   WebDriver driver=new ChromeDriver();
   driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get(du.getDataFromProperties("url"));
      driver.findElement(By.id("username")).sendKeys(du.getDataFromProperties("username"));
      driver.findElement(By.name("pwd")).sendKeys(du.getDataFromProperties("password"));
      driver.findElement(By.id("keepLoggedInCheckBoxContainer")).click();
      driver.findElement(By.id("loginButton")).click();
      
      driver.findElement(By.id("container_tasks")).click();
      
      driver.findElement(By.cssSelector(".title.ellipsis")).click();
      
      driver.findElement(By.className("createNewCustomer")).click();
      driver.findElement(By.className("newNameField")).sendKeys(customername);
      driver.findElement(By.cssSelector("[placeholder='Enter Customer Description']")).sendKeys("he is new customer");
      driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
      WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
      wait.until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector(".titleEditButtonContainer>.title"), customername));
      String ExpectedCustomerName=driver.findElement(By.cssSelector(".titleEditButtonContainer>.title")).getText();
      System.out.println(ExpectedCustomerName);
  }
}*/
