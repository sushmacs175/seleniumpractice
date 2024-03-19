package seleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfId {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//inspect on email text field
		WebElement emailTextField=driver.findElement(By.id("email"));
		emailTextField.sendKeys("sushmacs175@gmail.com");
		
		

	}

}
