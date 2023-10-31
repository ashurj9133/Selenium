package advanceSel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonCheckbox {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ashutosh\\Desktop\\Selenium\\Drivers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	WebElement cl=	driver.findElement(By.id("twotabsearchtextbox"));
			cl.sendKeys("iphone 14");
			cl.submit();
//String product=driver.findElement(By.xpath("//span[@data-component-type='s-search-results']/descendant::span[text()='Apple iPhone 14 Pro (128 GB) - Deep Purple'][1]")).getText();
//String product=driver.findElement(By.xpath("//*[@id='search']/div[1]/div[1]/div/span[1]/div[1]/div[6]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).getText();
String product=driver.findElement(By.cssSelector("div[class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_5'] a[class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']")).getText();
//String product=driver.findElement(By.xpath("//u[.='+3 colours/patterns']/ancestor::div[@class='a-section']/descendant::span[.='Apple iPhone 14 Pro (128 GB) - Deep Purple']")).getText();
//String product=driver.findElement(By.xpath("//div[@data-asin='B0BDJ6ZMCC']/descendant::div[@class='a-section a-spacing-small puis-padding-left-small puis-padding-right-small']/descendant::span[text()='Apple iPhone 14 Pro (128 GB) - Deep Purple']")).getText();
String price=driver.findElement(By.xpath("//div[contains(@class,'rush-component')]//span[@class='a-price-whole']")).getText();
			FileInputStream fis=new FileInputStream("C:\\Users\\ashutosh\\Desktop\\JavaFullCourse\\Book.xlsx");
			Workbook book=WorkbookFactory.create(fis);
			Sheet sh=book.getSheet("sheet3");
			//sh.createRow(0).createCell(0).setCellValue(product);
			//sh.createRow(0).createCell(1).setCellValue(price);
			int rowCount = sh.getLastRowNum();
	        sh.createRow(rowCount + 1).createCell(0).setCellValue(product);
	        sh.getRow(rowCount + 1).createCell(1).setCellValue(price);

			//int rowCount = sh.getLastRowNum();  //automatic cell me value likhna aur below row ke cell me control move krna
	        //sh.createRow(rowCount + 1).createCell(0).setCellValue(price);

			FileOutputStream fos=new FileOutputStream("C:\\Users\\ashutosh\\Desktop\\JavaFullCourse\\Book.xlsx");
			book.write(fos);
	
           driver.quit();
	}

}
