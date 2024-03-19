package seleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfCurrentUrl {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		String expectedUrl= "https://www.facebook.com/";
		System.out.println("expectedUrl"+ expectedUrl);
		
		String actualUrl =driver.getCurrentUrl();
		System.out.println("acualUrl" + actualUrl);
		
		if(actualUrl.equals(expectedUrl))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		

	}

}
