package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OneMoreForValueAttribute {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		 WebElement usernameTextField =driver.findElement(By.id("username"));
		String valueOfUsernameTextfield =usernameTextField.getAttribute("value");
		
		if(valueOfUsernameTextfield.isEmpty())
		{
			System.out.println("Method:True The data should not be present");
			System.out.println("According to customer requirement the data should not be present");
			usernameTextField.sendKeys("admin");
		}
		else
		{
			System.out.println("Method:True The data should  be present");
			System.out.println("According to customer requirement the data should  be present");
			usernameTextField.clear();
			usernameTextField.sendKeys("ADMIN");
			
			
		}
		

	}

}
