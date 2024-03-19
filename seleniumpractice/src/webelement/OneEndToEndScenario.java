package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OneEndToEndScenario {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");

		WebElement usernameTextField = driver.findElement(By.id("username"));
		usernameTextField.sendKeys("ADMIN");

		WebElement passwordTextField = driver.findElement(By.name("pwd"));
		passwordTextField.sendKeys("manager");
		
		WebElement loginOption=driver.findElement(By.id("loginButton"));
		loginOption.click();
		
		String actualHomepageUrl=driver.getCurrentUrl();
		
		if(actualHomepageUrl.equals("https://demo.actitime.com/user/submit_tt.do"))
		{
			WebElement logoutLink= driver.findElement(By.id("logoutLink"));
			System.out.println("actualHomepageUrl is "+ actualHomepageUrl);
			if(logoutLink.isDisplayed())
			{
				logoutLink.click();
				System.out.println("logoutLink is not displayed");
			}
		}
		else
		{
			System.out.println("actualHomepageUrl is not as per expected");
		}
	}

}
