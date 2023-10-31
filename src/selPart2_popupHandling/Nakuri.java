package selPart2_popupHandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Nakuri {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.naukri.com/");
        driver.findElement(By.linkText("Register")).click();
        Actions act=new Actions(driver);
        act.scrollByAmount(0,1500).perform();
        driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
        Thread.sleep(10000);
        StringSelection path=new StringSelection("C:\\Users\\ashutosh\\Downloads\\Documents\\resume3_2_4.pdf");
        
        Clipboard cp=Toolkit.getDefaultToolkit().getSystemClipboard();
        cp.setContents(path, null);
       Robot r=new Robot();
       r.keyPress(KeyEvent.VK_CONTROL);
       r.keyPress(KeyEvent.VK_V);
       r.keyRelease(KeyEvent.VK_CONTROL);
       r.keyRelease(KeyEvent.VK_V);
       r.keyPress(KeyEvent.VK_ENTER);
       r.keyRelease(KeyEvent.VK_ENTER);
	}

}
