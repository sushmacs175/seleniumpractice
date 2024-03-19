package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfClearMethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://crmaccess.vtiger.com/log-in/?mode=continue");
		
		WebElement usernameTextFied= driver.findElement(By.name("username"));
		usernameTextFied.clear();
		
		WebElement pwdTextFied= driver.findElement(By.name("password"));
		pwdTextFied.clear();
		
		

	}

}
