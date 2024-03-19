package webelement;

import java.time.Duration;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoadTimeOut {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20 ));
		
		
		try {
			driver.get("https://www.myntra.com/");
		}
		catch(TimeoutException e)
		{
			System.out.println("fail: the application is not having the capacity to load within the specified time");
		}


	}

}
