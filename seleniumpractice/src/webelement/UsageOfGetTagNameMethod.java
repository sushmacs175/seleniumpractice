package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetTagNameMethod {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://crmaccess.vtiger.com/log-in/?mode=continue");
		
		String expectedTagName="button";
		System.out.println("expectedTagName is " +expectedTagName);
		WebElement signInButton=driver.findElement(By.xpath("//button[text()=\"Sign in\"]"));
		String actualTagName=signInButton.getTagName();
		System.out.println("actualTagname is " +actualTagName);
		
		if(actualTagName.equals(expectedTagName))
		{
			System.out.println("pass-the tag name is as per expected");
		}
		else
		{
			System.out.println("pass-the tag name is not as per expected");
		}

	}

}
