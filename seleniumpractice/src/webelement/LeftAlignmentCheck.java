package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeftAlignmentCheck {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get( "https://en-gb.facebook.com/");
		//email--
		WebElement emailTextField=driver.findElement(By.id("email"));
		  Rectangle emailRect=emailTextField.getRect();
		  int emailStartX=emailRect.getX();
		  System.out.println("emailStartX is " +emailStartX);
		  int emailWidth=emailRect.getWidth();
		  System.out.println("emailWidth is " +emailWidth);
		 
		  int emailEndX=emailStartX+emailWidth;
		  System.out.println("emailEndXis " +emailEndX);
		  
		  //password
		  WebElement passwordTextField=driver.findElement(By.id("passContainer"));
		  Rectangle passwordRect=passwordTextField.getRect();
		  int passwordStartX=passwordRect.getX();
		  System.out.println("passwordStartX is" +passwordStartX);
		  int passwordWidth=passwordRect.getWidth();
		  System.out.println("passwordWidth is "+ passwordWidth);
		  
		  int passEndX=passwordStartX+passwordWidth;
		  System.out.println("passEndX is"+passEndX);
		  
		  if(emailEndX==passEndX)
		  {
			  System.out.println("pass : The left alignment of email and  password textfield is verified and found correct");
		  }
		  else
		  {
			  System.out.println("pass : The left alignment of email and  password textfield is verified and found incorrect");
		  }
	}

}
