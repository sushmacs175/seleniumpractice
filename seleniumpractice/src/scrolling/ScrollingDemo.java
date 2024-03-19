package scrolling;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.google.com/doodles#archieve");
		Thread.sleep(2000);
		
		JavascriptExecutor jse= (JavascriptExecutor)driver;
//		jse.executeScript("window.scrollBy(0,2000)");
//		jse.executeScript("window.scrollBy(0,-500)");
		
		jse.executeScript("window.scrollTo(0,2000)");
		jse.executeScript("window.scrollTo(0,-500)");
		
		

	}

}
