package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TopAlignmentCheck {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get( "https://www.facebook.com/login/identify/?ctx=recover&ars=facebook_login&from_login_screen=0");
		
		//email
		
		WebElement emailTextField=driver.findElement(By.name("email"));
		Rectangle rectOfEmail=emailTextField.getRect();
		
		int yaxisOfEmail=rectOfEmail.getY();
		System.out.println("yaxisOfEmail " +yaxisOfEmail);
		
	    Dimension sizeOFEmail=emailTextField.getSize();
	    int heightOfEmail=sizeOFEmail.getHeight();
	    System.out.println("heightOfEmail is "+ heightOfEmail);
		
	    int emailYaxis=yaxisOfEmail+heightOfEmail;
	    System.out.println(emailYaxis);
	    
	    WebElement passwordTextField=driver.findElement(By.xpath("//input[@placeholder=\"Password\"]"));
	    Rectangle recOfPassword=passwordTextField.getRect();
	    
	    int yaxisofPassword=recOfPassword.getY();
	    System.out.println("yaxisofPassword " + yaxisofPassword);
	    
	    Dimension sizeOfPassword=passwordTextField.getSize();
	    int heightOfPassword=sizeOfPassword.getHeight();
	    System.out.println("heightOfPassword is " +heightOfPassword);
	    
	    int passwordYaxis=yaxisofPassword+heightOfPassword;
	    System.out.println(passwordYaxis);
	    
	    
	    

	}

}
