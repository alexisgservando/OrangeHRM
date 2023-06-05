package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.DashboardPage;
import pages.HRMloginPage;

public class LoginTest_TestNG {

	WebDriver driver = null;
	HRMloginPage hrmloginpage = new HRMloginPage();

	@BeforeTest
	public void setUpTest() {
		// Initializing the webdriver
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	}

	@Test
	public void test1() {
		// Setting the test variables
		String user = "Admin";
		String pass = "admin123";
		
		driver.get("http://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();

		// Looking for Element "Login"
		String headerText = hrmloginpage.loginHeader(driver).getText();
		System.out.println(headerText);

		// Filling username field
		WebElement username = hrmloginpage.usernameField(driver); // HRMloginPage.usernameField(driver);
		username.clear();
		username.sendKeys(user);

		// Filling password field
		WebElement password = hrmloginpage.passwordField(driver); // HRMloginPage.passwordField(driver);
		password.clear();
		password.sendKeys(pass);

		// Clicking login button
		WebElement loginButton = hrmloginpage.loginButton(driver); // HRMloginPage.loginButton(driver);
		loginButton.click();

		DashboardPage dashboardPage = new DashboardPage();
		String dHeader = dashboardPage.dashboardHeader(driver).getText();
		System.out.println("DASHBOARD HEADER: " + dHeader);
		System.out.println("-------- END OF TEST 1 -----------");
	}

	@Test
	public void test2() {
		// Setting the test variables
		String user = "Admininvalid";
		String pass = "admin123invalid";
		
		driver.get("http://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();

		// Looking for Element "Login"
		String headerText = hrmloginpage.loginHeader(driver).getText();
		System.out.println(headerText);

		// Filling username field
		WebElement username = hrmloginpage.usernameField(driver); // HRMloginPage.usernameField(driver);
		username.clear();
		username.sendKeys(user);

		// Filling password field
		WebElement password = hrmloginpage.passwordField(driver); // HRMloginPage.passwordField(driver);
		password.clear();
		password.sendKeys(pass);

		// Clicking login button
		WebElement loginButton = hrmloginpage.loginButton(driver); // HRMloginPage.loginButton(driver);
		loginButton.click();
		System.out.println("-------- END OF TEST 2 -----------");
	}

	@AfterTest
	public void tearDown() {
		driver.close();
		//driver.quit();
	}
}

