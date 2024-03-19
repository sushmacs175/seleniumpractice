 package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterTheDataByUsingEnum {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://crmaccess.vtiger.com/log-in/?mode=continue");
		WebElement usernameTextfield=driver.findElement(By.name("username"));
		usernameTextfield.sendKeys("Welcome");
		
		usernameTextfield.sendKeys(Keys.CONTROL+"a");
		usernameTextfield.sendKeys(Keys.DELETE);
		usernameTextfield.sendKeys(Keys.chord("admin"));
		
		WebElement pwdextfield=driver.findElement(By.name("password"));
		pwdextfield.sendKeys("Welcome");
		
		pwdextfield.sendKeys(Keys.CONTROL+"a");
		pwdextfield.sendKeys(Keys.DELETE);
		pwdextfield.sendKeys(Keys.chord("Test@123"));
		
		WebElement loginButton=driver.findElement(By.xpath("//button[text()='Sign in']"));
		
		loginButton.sendKeys(Keys.ENTER);

	}

}
