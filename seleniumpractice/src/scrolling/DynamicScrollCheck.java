package scrolling;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicScrollCheck {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				
		driver.get("https://www.google.com/doodles#archieve");
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		long googleDoodleHeight=(long)jse.executeScript(" return document.body.scrollHeight");
		System.out.println("googleDoodleHeight is "+googleDoodleHeight);
		
		long googleDoodleWidth=(long)jse.executeScript(" return document.body.scrollWidth");
		System.out.println("googleDoodleWidth is "+googleDoodleWidth);
		
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		long googleDoodleHeight01=(long)jse.executeScript(" return document.body.scrollHeight");
		System.out.println("googleDoodleHeight01 is "+googleDoodleHeight01);
		
		long googleDoodleWidth01=(long)jse.executeScript(" return document.body.scrollWidth");
		System.out.println("googleDoodleWidth01 is "+googleDoodleWidth01);
		
	}

}
