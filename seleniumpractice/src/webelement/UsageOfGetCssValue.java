package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetCssValue {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement loginButton=driver.findElement(By.name("login"));
		String fontfamilyofLoginButton = loginButton.getCssValue("font-family");
		
		System.out.println("fontfamilyofLoginButton is " + fontfamilyofLoginButton);

	}

}
