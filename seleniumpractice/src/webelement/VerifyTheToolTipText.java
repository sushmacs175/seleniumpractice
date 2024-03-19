package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTheToolTipText {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement  keepLoggedInCheckBox=driver.findElement(By.id("keepLoggedInCheckBox"));
		String toolTipText = keepLoggedInCheckBox.getAttribute("title");
		
		System.out.println("toolTipText= " +toolTipText);

	}

}
