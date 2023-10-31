package anonymousAssinment;


	import java.time.Duration;
	import java.util.List;
	import java.util.Set;
	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	public class GenericAddProductFlipkart {

	    public static void main(String[] args) throws InterruptedException {
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	        driver.get("https://www.flipkart.com/");
           //calling login popup
	        closeLoginPopup(driver);

	        searchAndAddProducts(driver, "mobiles",
	                "SAMSUNG Galaxy F13 (Nightsky Green, 64 GB)",
	                "SAMSUNG Galaxy F04 (Jade Purple, 64 GB)",
	                "SAMSUNG Galaxy F13 (Waterfall Blue, 64 GB)");
           //calling view cart
	        viewCart(driver);
	        
	        printProductDetailsAndPrices(driver,
	                By.xpath("//a[contains(@class,'gBNbID')]"),
	                By.xpath("//span[text()='₹'][2]"));

	        driver.quit();
	    }

	    public static void closeLoginPopup(WebDriver driver) {
	        try {
	            driver.findElement(By.xpath("//button[text()='✕']")).click();
	        } catch (Exception e) {
	            // Handle exception
	        }
	    }

	    public static void searchAndAddProducts(WebDriver driver, String searchKeyword, String... productNames) {
	        driver.findElement(By.name("q")).sendKeys(searchKeyword, Keys.ENTER);
	        driver.findElement(By.xpath("//div[text()='Relevance']")).click();

	        String mainWindow = driver.getWindowHandle();

	        for (String productName : productNames) {
	            driver.findElement(By.xpath("//div[text()='" + productName + "']")).click();

	            Set<String> handles = driver.getWindowHandles();
	            for (String handle : handles) {
	                if (!mainWindow.equals(handle)) {
	                    driver.switchTo().window(handle);
	                    driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
	                    driver.close();
	                }
	            }

	            driver.switchTo().window(mainWindow);
	        }
	    }

	    public static void viewCart(WebDriver driver) {
	        driver.findElement(By.xpath("//span[text()='Cart']")).click();
	    }
	    
	    public static void printProductDetailsAndPrices(WebDriver driver, By productNameLocator, By productPriceLocator) {
	        List<WebElement> productNames = driver.findElements(productNameLocator);
	        List<WebElement> productPrices = driver.findElements(productPriceLocator);

	        for (int i = 0; i < productNames.size(); i++) {
	            WebElement productName = productNames.get(i);
	            WebElement productPrice = productPrices.get(i);

	            System.out.println("Product Name: " + productName.getText());
	            System.out.println("Product Price: " + productPrice.getText());
	            System.out.println();
	        }
	    }
	}


