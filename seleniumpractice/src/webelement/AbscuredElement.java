package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbscuredElement {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.com/");
		//Thread.sleep(4000);
		
		WebElement dontChangeOptions=driver.findElement(By.xpath("//span[contains(text(),\" Don't Change\")]/../input[@type=\"submit\"]"));
		dontChangeOptions.click();
		//Thread.sleep(2000);
		
		WebElement customerServiceLink=driver.findElement(By.xpath("(//a[text()=\"Customer Service\"])[1]"));
		customerServiceLink.click();
		
		
		driver.manage().window().minimize();
		driver.quit();                           
		

	}

}
