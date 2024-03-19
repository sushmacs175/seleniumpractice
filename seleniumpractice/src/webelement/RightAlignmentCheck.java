package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RightAlignmentCheck {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get( "https://en-gb.facebook.com/");
		
		//email
	  WebElement emailTextField=driver.findElement(By.id("email"));
	  Point locationOfEmailTextField=emailTextField.getLocation();
	  int emailStartX=locationOfEmailTextField.getX();
	  System.out.println("emailStartX is " +emailStartX);
	  
	  //password
	 WebElement  passwordTextField=driver.findElement(By.id("passContainer"));
	 Point locationOfPasswordTextField=passwordTextField.getLocation();
	 int passwordStartX = locationOfPasswordTextField.getX();
	 System.out.println("passwordStartX is "+ passwordStartX);
	 
	 if(emailStartX==passwordStartX)
	 {
		 System.out.println("pass: The right element is verified and found correct --xcoordinate of both the element should be same (getX) ");
	 }
	 else
	 {
		 System.out.println("fail: The right element is verified and found incorrect");
	 }

	}

}
