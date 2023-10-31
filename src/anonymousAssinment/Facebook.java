package anonymousAssinment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ashutosh\\Desktop\\Selenium\\Drivers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/signup");
		//generic way
		printDropdownOptions(driver, "day");
        printDropdownOptions(driver, "month");
        printDropdownOptions(driver, "year");

        //driver.quit();
    }

    public static void printDropdownOptions(ChromeDriver driver, String dropdownId) {
        WebElement dropdown = driver.findElement(By.id(dropdownId));
        Select select = new Select(dropdown);
        List<WebElement> options = select.getOptions();
        System.out.println("All " + dropdownId + " Options:");
        for (WebElement option : options) {
            System.out.println(option.getText());
        }
        
//		WebElement dro=driver.findElement(By.id("day"));
//		Select s=new Select(dro);
//		s.selectByValue("5");
//	WebElement drop=driver.findElement(By.name("birthday_month"));
//	   
//		Select s1=new Select(drop);
//		s1.selectByVisibleText("Dec");
//		WebElement r=driver.findElement(By.id("year"));
//		   
//		Select s2=new Select(r);
//		s2.selectByVisibleText("2021");
//	List<WebElement> dr=s.getOptions();
//	for(WebElement option:dr)
//	{
//		System.out.println(option.getText());
//	}
		
		
}
}