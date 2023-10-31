package seleniumPart1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Coronavirus {
   WebDriver driver;
   public static void main(String[]args) {
	   Coronavirus c=new Coronavirus();
	   c.loginBrowser();
	   String dr=c.fetchWorld();
	   System.out.println(dr);
	   c.closeBrowser();
   }
   public void loginBrowser()
   {
	   driver=new ChromeDriver();
	   driver.get("https://www.worldometers.info/coronavirus/");
	   driver.manage().window().maximize();
   }
   public String fetchWorld()
   {
	   String driver1=driver.findElement(By.xpath("//h1[text()='Coronavirus Cases:']/following-sibling::div/span")).getText();
	   String driver2=driver.findElement(By.xpath("//h1[text()='Deaths:']/following-sibling::div/span")).getText();
	   String driver3=driver.findElement(By.xpath("//h1[text()='Recovered:']/following-sibling::div/span")).getText();
	   //String dr2=driver.findElement(By.xpath("//h1[text()='Recovered:']/../.")).getText();
//	   System.out.println("Coronavirus Cases: "+dr);
//	   System.out.println("Deaths: "+dr1);
//	   System.out.println("Recovered: "+dr2);
	   return "CoronavirusCases: "+driver1+" Deaths: "+driver2+" Recovered: "+driver3;
   }
   public void closeBrowser()
   {
	   driver.close();
   }
}
