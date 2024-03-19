package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfIsEnabledMethod01 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get( "https://sandbox.abdm.gov.in/applications/cowin/Home/cowin_signup_form");
		Thread.sleep(2000);
		
		WebElement submitOption=driver.findElement(By.name("submit"));
		
		if(submitOption.isEnabled())
		{
			System.out.println("method -true");
			System.out.println("appln false- the submit option should be enabled");
		}
		else
		{
			System.out.println("method -false");
			System.out.println("appln true- the submit option should not be enabled");
		}
		
		WebElement acceptTermsAndCondition= driver.findElement(By.xpath("//button[text()=\"Accept Terms of Service\"]"));
		acceptTermsAndCondition.click();
		Thread.sleep(2000);
		
		WebElement acceptTermsOfServiceCheckBox = driver.findElement(By.id("confbtn"));
		acceptTermsOfServiceCheckBox.click();
		Thread.sleep(2000);
		
		WebElement closeOption= driver.findElement(By.xpath("//button[text()=\"Close\"]"));
		closeOption.click();
		Thread.sleep(2000);
		submitOption.click();
		Thread.sleep(2000);

	}

}
