package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTheValueAttribute {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		
		WebElement usernameTextField=driver.findElement(By.id("username"));
		String valueOfEmailTextField =usernameTextField.getAttribute("value");
		
		if(valueOfEmailTextField.isEmpty())
		{
			System.out.println("Method: True The data should not be present");
			System.out.println("The data is not present");
			usernameTextField.sendKeys("admin");
		}
		else
		{
			System.out.println("Method: false The data is present in the text field");
			System.out.println("The data is present in the text field");
			usernameTextField.sendKeys(Keys.CONTROL+"a");
			usernameTextField.sendKeys(Keys.DELETE);
			usernameTextField.sendKeys(Keys.chord("admin"));
		}
		

	}

}
