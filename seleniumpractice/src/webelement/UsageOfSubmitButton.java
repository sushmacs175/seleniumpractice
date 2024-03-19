package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfSubmitButton {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		WebElement loginButton=driver.findElement(By.name("email"));
		loginButton.submit();
		
		Thread.sleep(1000);
		//driver.manage().window().minimize();
		//driver.quit();
	}

}
