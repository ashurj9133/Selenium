package selPart2_popupHandling;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Nakuri1 {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        

        // Create a new instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Maximize the browser window
        driver.manage().window().maximize();

        // Navigate to the Naukri website
        driver.get("https://www.naukri.com/");

        try {
            // Click on the "Upload Resume" button
            driver.findElement(By.linkText("Register")).click();
            Thread.sleep(2000); // Adding a wait to ensure the page loads completely

            
            Actions act=new Actions(driver);
            act.scrollByAmount(0,1500).perform();
            // Find the file input element and provide the file path to the resume
            String filePath = "C:\\Users\\ashutosh\\Downloads\\resume3_2.docx";
            WebElement fileInput = driver.findElement(By.xpath("//input[@type='file']"));
            fileInput.sendKeys(filePath);

            // Add a wait to allow the upload to complete
            Thread.sleep(5000);

            // You can perform additional actions here, if needed.

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Close the browser after automation is complete
            driver.quit();
        }
    }
}
