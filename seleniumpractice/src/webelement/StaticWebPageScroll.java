package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebPageScroll {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sandbox.abdm.gov.in/applications/cowin/Home/cowin_signup_form");
		WebElement acceptTermsandConditions=driver.findElement(By.xpath("//button[text()=\'Accept Terms of Service\']"));
		acceptTermsandConditions.click();
		Thread.sleep(1000);
		driver.manage().window().minimize();
		driver.quit();
		
				

	}

}
