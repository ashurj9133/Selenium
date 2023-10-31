package selPart2_popupHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class AlertPopUp{
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
	
	  Alert alt=driver.switchTo().alert();
	  String msg=alt.getText();
	 System.out.println(msg);
	  
	 alt.accept();
	 String result=driver.findElement(By.id("result")).getText();
	 System.out.println(result);
	//System.out.println(driver.switchTo().alert().getText());
}
}
