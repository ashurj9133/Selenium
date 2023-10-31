package seleniumPart2First;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium08.blogspot.com/2020/01/drag-drop.html");
		//WebElement dr= driver.findElement(By.xpath("//a[text()='Drag and Drop']"));
		Actions act=new Actions(driver);
		//act.moveToElement(dr).perform();
		WebElement a=driver.findElement(By.id("draggable"));//first inspect source Webelement
		WebElement b=driver.findElement(By.id("droppable")); //first inspect target webelement
		
		     
		     act.dragAndDrop(a,b).perform();
		     		
		 
		
	}

}
