package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfSendKeys {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement usernameTextFied= driver.findElement(By.name("username"));
		usernameTextFied.sendKeys("admin");
		
		WebElement pwdTextFied= driver.findElement(By.name("pwd"));
		pwdTextFied.sendKeys("Test@123");
		

	}

}
