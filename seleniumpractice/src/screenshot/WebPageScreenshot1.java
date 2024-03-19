package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebPageScreenshot1 {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		String timeStamp=LocalDateTime.now().toString().replace(':','-');
		
		driver.get("https://www.the-maharajas.com/");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File temporaryFile = ts.getScreenshotAs(OutputType.FILE);
		
		File permanentFile = new File("./errorshot/"+timeStamp+"maharajapage.png");
		
		
		FileUtils.copyFile(temporaryFile, permanentFile);

	}

}
