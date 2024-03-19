package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTheAltText {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		WebElement   grocerry =driver.findElement(By.xpath("//img[@alt=\"Grocery\"]"));
		String alternateText =grocerry.getAttribute("alt");
		
		System.out.println("alternateText is =" +alternateText);

	}

}
