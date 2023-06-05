package tests;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HRMloginPage;

public class LoginTest {
	
	private static WebDriver driver = null;

	public static void main(String[] args)
	{
		//TODO Auto-generated method stub
		fillLoginPage();
	}
	
	public static void fillLoginPage()
	{
		//Setting the test variables
	    String user = "Admin";
	    String pass = "admin123";
	    
	    //Initializing the webdriver
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		
		//Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    driver.manage().window().maximize();
		
		/*
		//Creating an object of the Login Page class - UNCOMMENT HRMLOGINPAGEOBJECTS.JAVA
		HRMloginPageObjects loginPageObject = new HRMloginPageObjects(driver);
		loginPageObject.typeUsername(user);
		loginPageObject.typePassword(pass);
		loginPageObject.clickLoginButton();
		*/
		
		HRMloginPage hrmloginpage = new HRMloginPage();
		//Looking for Element "Login"
		String headerText = hrmloginpage.loginHeader(driver).getText();
		System.out.println(headerText);
		
		//Filling username field
		WebElement username = hrmloginpage.usernameField(driver); //HRMloginPage.usernameField(driver);
		username.clear();
		username.sendKeys(user);
		
		//Filling password field
		WebElement password = hrmloginpage.passwordField(driver); //HRMloginPage.passwordField(driver);
		password.clear();
		password.sendKeys(pass);
		
		//Clicking login button 
		WebElement loginButton = hrmloginpage.loginButton(driver); //HRMloginPage.loginButton(driver);
		loginButton.click();
	
		//driver.close();
		//driver.quit();
	}
}
