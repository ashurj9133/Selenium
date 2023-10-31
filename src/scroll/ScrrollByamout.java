package scroll;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrrollByamout {
//pixel level scrolling in browser level
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Actions act=new Actions(driver);
		act.scrollByAmount(0,5000).perform();

	}

}
