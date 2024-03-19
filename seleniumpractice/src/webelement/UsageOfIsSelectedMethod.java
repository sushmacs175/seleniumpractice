package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfIsSelectedMethod {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);

		WebElement	keepLoggedInCheckBox =driver.findElement(By.id("keepLoggedInCheckBox"));

		if(keepLoggedInCheckBox.isSelected())
		{
			System.out.println("method:true");
			System.out.println("application false: the keepLoggedInCheckBox should be in the selected format or selected state");
		}
		else
		{
			System.out.println("method:false");
			System.out.println("application true: the keepLoggedInCheckBox should  not be in the selected format or selected state");
			keepLoggedInCheckBox.click();
			
		}
	}

}
