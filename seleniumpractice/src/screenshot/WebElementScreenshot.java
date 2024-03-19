package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementScreenshot {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		String timeStamp=LocalDateTime.now().toString().replace(':','-');
		
		driver.get("https://www.royalchallengers.com/");
		WebElement rcblogo = driver.findElement(By.xpath("//div[@class='hdr-logo']//img"));
		 
		File tempFile=rcblogo.getScreenshotAs(OutputType.FILE);
		File permFile= new File("./errorshots/"+timeStamp+"rcblogo.png");
		
		FileUtils.copyFile(tempFile, permFile);
		

	}

}
