package scrolling;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticScrollCheck {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				
		driver.get("https://www.facebook.com/");
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		long fbHeight=(long)jse.executeScript(" return document.body.scrollHeight");
		System.out.println("fbHeight is "+fbHeight);

		long fbWidth=(long)jse.executeScript(" return document.body.scrollWidth");
		System.out.println("fbWidth is "+fbWidth);
		
		driver.navigate().refresh();
		
		long fbHeight01=(long)jse.executeScript(" return document.body.scrollHeight");
		System.out.println("fbHeight01 is "+fbHeight01);
		
		long fbWidth01=(long)jse.executeScript(" return document.body.scrollWidth");
		System.out.println("fbWidth01 is "+fbWidth01);
		
		
	}

}
