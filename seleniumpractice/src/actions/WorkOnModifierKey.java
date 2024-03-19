package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkOnModifierKey {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://demo.vtiger.com/vtigercrm/");
		
		WebElement usernameTextField=driver.findElement(By.name("username"));

		Actions actions=new Actions(driver);
		
		actions.keyDown(usernameTextField,Keys.CONTROL).pause(1000).sendKeys("a").pause(1000).keyUp(usernameTextField,Keys.BACK_SPACE).pause(1000).keyDown(usernameTextField,Keys.SHIFT).pause(1000).sendKeys(usernameTextField,"admin").pause(1000).keyUp(usernameTextField,Keys.SHIFT).build().perform();
	}

}
