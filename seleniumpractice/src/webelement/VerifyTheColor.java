package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class VerifyTheColor {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement loginButton=driver.findElement(By.name("login"));
		String backgroundcolor=loginButton.getCssValue("background-color");
		
		System.out.println("background-color is "+ backgroundcolor );
		
		String hexaDecimalValue=Color.fromString(backgroundcolor).asHex();
		
		System.out.println("hexaDecimalValue is " + hexaDecimalValue);
		

	}

}
