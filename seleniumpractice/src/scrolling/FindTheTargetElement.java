package scrolling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindTheTargetElement {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

		driver.get("https://www.google.com/doodles#archieve");

		JavascriptExecutor jse=(JavascriptExecutor)driver;
		for(;;) {
			try
			{
				WebElement israelIndependenceDayDoodle =driver.findElement(By.xpath("//a[text()=\"Israel Independence Day 2023\"]"));
				israelIndependenceDayDoodle.click();
				break;
			}
			catch (NoSuchElementException e) 
			{
				jse.executeScript("window.scrollBy(0,500)");
			}
		}

	}

}
