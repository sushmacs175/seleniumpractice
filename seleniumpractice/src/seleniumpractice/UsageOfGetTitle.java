package seleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetTitle {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		String expectedTitle="Facebook – log in or sign up";
		System.out.println("expected title is"+ expectedTitle);
		
		String actualTitle= driver.getTitle();
		System.out.println("actual title is " + actualTitle);
		
		if(actualTitle.equals(expectedTitle))
		{
			System.out.println("Pass: Actual title is verified and found correct");
		}
		else
		{
			System.out.println("fail: Actual title is verified and found incorrect");
		}

	}

}
