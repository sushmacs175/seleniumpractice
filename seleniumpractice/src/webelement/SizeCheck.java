package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SizeCheck {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get( "https://en-gb.facebook.com/");
		//email--
		WebElement emailTextField=driver.findElement(By.id("email"));
		 
		Dimension sizeOfEmailTextField=emailTextField.getSize();
		
		int heightofEmailTextField=sizeOfEmailTextField.getHeight();
		System.out.println("heightofEmailTextField is " + heightofEmailTextField);
		
		int widthofEmailTextField=sizeOfEmailTextField.getWidth();
		System.out.println("widthofEmailTextField is " +widthofEmailTextField);
		
		//password
		
		WebElement passwordTextField=driver.findElement(By.id("passContainer"));
		Dimension sizeofPasswordTextField = passwordTextField.getSize();
		int heightofPasswordTextField= sizeofPasswordTextField.getHeight();
		System.out.println("heightofPasswordTextField " +heightofPasswordTextField);
		int widhtofPasswordTextField=sizeofPasswordTextField.getWidth();
		System.out.println("widhtofPasswordTextField " +widhtofPasswordTextField);
		
		//verify and validate
		
		if(heightofEmailTextField==heightofPasswordTextField && widthofEmailTextField==widhtofPasswordTextField)
		{
			System.out.println("pass: height of email and password text field and width of email and password text field is verified found correct");
		}
		else
		{
			System.out.println("fail: height of email and password text field and width of email and password text field is verified found incorrect");
		}

	}

}
