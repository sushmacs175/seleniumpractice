package seleniumpractice;

import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleMultipleWindows {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.get("https://en-gb.facebook.com/reg/");
		
		Set<String> allWid=driver.getWindowHandles();
		System.out.println(allWid);
		
		for(String wid:allWid)
		{
			String widTitle=driver.switchTo().window(wid).getTitle();
			System.out.println(widTitle);
		
			if(widTitle.equals("Facebook – log in or sign up"))
			{
				//parent window
			}
			else
			{
				Dimension sizeOfTheWindow=driver.manage().window().getSize();
				int heightOfTheWindow=sizeOfTheWindow.getHeight();
				System.out.println("heightofthewindow is" +heightOfTheWindow);
				int widthOfTheWindow=sizeOfTheWindow.getWidth();
				System.out.println("widthofthewindow" + widthOfTheWindow);
				
				Point positionOfTheWindow=driver.manage().window().getPosition();
				int startX=positionOfTheWindow.getX();
				System.out.println("startX" +startX);
				int startY=positionOfTheWindow.getY();
				System.out.println("startY" +startY);
				
				Dimension definedSize=new Dimension(200,500);
				driver.manage().window().setSize(definedSize);
				
				Thread.sleep(2000);
				Point definedPosition=new Point(90,150);
				driver.manage().window().setPosition(definedPosition);	
			}
		}//for ends
		
		driver.manage().window().minimize();
		driver.quit();
	}

}
