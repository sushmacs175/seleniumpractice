package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToEle {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.cowin.gov.in/");
		
//		JavascriptExecutor jse =(JavascriptExecutor)driver;
//		jse.executeScript("window.scrollBy(0,300)");
		
		WebElement searchOption=driver.findElement(By.xpath("//button[text()='Search']"));
		
		Actions actions=new Actions(driver);
		actions.scrollToElement(searchOption).perform();
	}

}
