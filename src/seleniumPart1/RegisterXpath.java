package seleniumPart1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("C:\\Users\\ashutosh\\Downloads\\register.html");
	      driver.findElement(By.xpath("/html/body/input[1]")).sendKeys("admin");
	      driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("ashutosh");
	      driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("ashutosh123@gmail.com");
	      driver.findElement(By.xpath("/html/body/input[4]")).click();
	      driver.findElement(By.xpath("/html/body/input[7]")).click();
	      

	}

}
