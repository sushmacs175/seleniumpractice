package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfIsDispalyedMethod {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get( "https://en-gb.facebook.com/");
		
		WebElement emailTextField =driver.findElement(By.id("email"));
		
		if(emailTextField.isDisplayed())
		{
			System.out.println("method:true");
			System.out.println("application  true  : the emailTextField should be visible in webpage");
			emailTextField.sendKeys("QSPIDERS");
		}
		else 
		{
			System.out.println("method:false");
			System.out.println("application  false  : the emailTextField should not be visible in webpage");
		}

	}

}
