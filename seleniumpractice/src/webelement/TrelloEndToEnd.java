package webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TrelloEndToEnd {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://trello.com/");
		WebElement loginOption= driver.findElement(By.xpath("//a[text()=\"Get Trello for free\"]/preceding-sibling::a[text()=\"Log in\"]"));
		loginOption.click();

		String actualtrelloLoginUrl=driver.getCurrentUrl();

		if(actualtrelloLoginUrl.equals("https://trello.com/login"))
		{
			WebElement usernameTextField = driver.findElement(By.id("user"));
			usernameTextField.sendKeys("letsuccessmakesnoise@gmail.com");
			WebElement loginButton=driver.findElement(By.id("login"));
			loginButton.submit();   
			Thread.sleep(4000);
			System.out.println("actualtrelloLoginUrl is as per expeceted");

			String actualLoginToContinuePageUrl=driver.getCurrentUrl();
			if(actualLoginToContinuePageUrl.contains("https://id.atlassian.com/login?application=trello&continue"))
			{
				WebElement passwordTextField = driver.findElement(By.id("password"));
				passwordTextField.sendKeys("successisthekey");
				WebElement loginToContinueButton= driver.findElement(By.id("login-submit"));
				loginToContinueButton.submit();
				System.out.println("pass: loginToContinueButton page is as per expected");

				String actualBoardsPage=driver.getCurrentUrl();
				if(actualBoardsPage.equals("https://trello.com/u/letsuccessmakesnoise/boards"))
				{
					WebElement profileIcon=driver.findElement(By.xpath("//button[@aria-label=\"Open member menu\"]"));
					Thread.sleep(3000);
					profileIcon.click();
					Thread.sleep(2000);
					WebElement logoutOption=driver.findElement(By.xpath("//button/span[text()='Log out']"));
					logoutOption.click();
					String actualLogoutPage=driver.getCurrentUrl();
					if(actualLogoutPage.contains("https://id.atlassian.com/logout?continue"))
					{
						WebElement logoutButton= driver.findElement(By.id("logout-submit"));
						logoutButton.submit();
						System.out.println("pass:actualLogoutPage is as expected");
					}
					else
					{
						System.out.println("fail:actualLogoutPage is not as expected");
					}	
				}
				else
				{
					System.out.println("fail:actualBoardsPage is not as per expected");
				}
			}
			else
			{
				System.out.println("fail:actualLoginToContinuePageUrl is not as per expected");
			}

		}
		else {
			System.out.println("fail:actualtrelloLoginUrl is not as per expected ");
		}
	}

}
