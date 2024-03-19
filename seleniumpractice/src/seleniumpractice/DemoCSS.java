package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoCSS {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/reg/");
		
		WebElement firstnameTextField=driver.findElement(By.cssSelector("input[name='firstname']"));
		firstnameTextField.sendKeys("Sushma");
		
		WebElement mobileNumberTextField=driver.findElement(By.cssSelector("input[name='reg_email__']"));
		mobileNumberTextField.sendKeys("9874569325");
		

	}

}
