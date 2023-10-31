package part3RoughWork;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoadDataFromProperties {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis=new FileInputStream("C:\\Users\\ashutosh\\Desktop\\JavaFullCourse\\testdata.properties");
		Properties poj=new Properties();
		poj.load(fis);
		String url=poj.getProperty("url");
		
		System.out.println(url);
		
		String username=poj.getProperty("username");
		System.out.println(username);
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		driver.findElement(By.id("username")).sendKeys(username);
	}

}
