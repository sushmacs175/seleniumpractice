package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoClickMethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shop.malaicha.com/login");
		WebElement registerButton=driver.findElement(By.xpath("//button[text()='Register']"));
		registerButton.click();	
		Thread.sleep(2000);
		

	}

}
