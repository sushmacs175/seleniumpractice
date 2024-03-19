package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class VerifyColorOfsignUp {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/reg/");
		
		WebElement signupButton=driver.findElement(By.name("websubmit"));
		String backgroundColor = signupButton.getCssValue("background-color");
		
		System.out.println("background-color is "+ backgroundColor);
		
		String hexadecimalvalue=Color.fromString(backgroundColor).asHex();
		System.out.println("hexadecimalvalue is " + hexadecimalvalue);
		
		
		
	}

}
