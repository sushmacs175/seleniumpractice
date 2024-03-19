package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetTextMethod {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		String expectedagtext="Keep me logged in";
		System.out.println("expectedagtext is" +expectedagtext);
		WebElement keepLoggedInLabel=driver.findElement(By.id("keepLoggedInLabel"));
		String actualTagText=keepLoggedInLabel.getText();
		System.out.println("actualTagText is" +actualTagText);
		
		if(actualTagText.equals(expectedagtext))
		{
			System.out.println("pass: the tage text is verified and found correct");
		}
		else
		{
			System.out.println("fail: the tage text is verified and found  incorrect");
		}
		

	}

}
