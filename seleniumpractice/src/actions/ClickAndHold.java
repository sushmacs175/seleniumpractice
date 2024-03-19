package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		
	WebElement draggableEle=driver.findElement(By.id("draggable"));
	
	WebElement droppableEle=driver.findElement(By.id("droppable"));
	
	Actions actions=new Actions(driver);
	
	actions.clickAndHold(draggableEle).release(droppableEle).perform();
	

	}

}
