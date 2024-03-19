package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfIsEnabledMethod {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get( "https://en-gb.facebook.com/");

		WebElement loginButton=driver.findElement(By.name("login"));

		if(loginButton.isEnabled())
		{
			System.out.println("method: true");
			System.out.println("application -The login button should be in the enabled state");
			loginButton.submit();
		}
		else
		{
			System.out.println("method: false");
			System.out.println("application -The login button should  not be in the enabled state");
		}

	}

}
