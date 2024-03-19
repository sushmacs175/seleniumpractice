package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TravelFromOneOptionToAnother {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.myntra.com/");

		WebElement menOption=driver.findElement(By.xpath("//div[@class=\"desktop-navLink\"]/a[text()=\"Men\"]"));
		WebElement womenOption=driver.findElement(By.xpath("//div[@class=\"desktop-navLink\"]/a[text()=\"Women\"]"));
		WebElement kidsOption=driver.findElement(By.xpath("//div[@class=\"desktop-navLink\"]/a[text()=\"Kids\"]"));
		WebElement homeAndLivingoption=driver.findElement(By.xpath("//div[@class=\"desktop-navLink\"]/a[text()=\"Home & Living\"]"));
		WebElement studioOption=driver.findElement(By.xpath("//div[@class=\"desktop-navLink\"]/a[text()=\"Studio\"]"));


		Actions actions=new Actions(driver);

		actions.moveToElement(menOption, 0, 0).pause(1000).moveToElement(menOption, 75, 0).pause(1000).moveToElement(kidsOption, 99, 0).pause(1000).moveToElement(homeAndLivingoption, 108, 0).pause(1000).moveToElement(studioOption, 84, 0).perform();	
	}

}
