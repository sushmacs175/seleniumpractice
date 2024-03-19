package seleniumpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dassault-aviation.com/en/");
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.dassault-aviation.com/en/group/");
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.dassault-aviation.com/en/defense/");
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		
		
		driver.navigate().to("https://www.dassault-aviation.com/en/space/");
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		
		driver.manage().window().minimize();
		
		
		

	}

}
