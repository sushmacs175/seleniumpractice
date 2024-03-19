package seleniumpractice;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToSubUrl {

	public static void main(String[] args) throws MalformedURLException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dassault-aviation.com/en/");
		
		URL mainUrl=new URL("https://www.dassault-aviation.com/en/");
		URL groupPageUrl=new URL(mainUrl,"group/");
		
		driver.navigate().to(groupPageUrl);
		
		
		URL spaceURl=new URL(mainUrl,"space/");
		driver.navigate().to(spaceURl);                       
		
		

	}

}
