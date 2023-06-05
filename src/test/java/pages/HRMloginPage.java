package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.UtilitiesTestClass;

public class HRMloginPage {
	
	private static WebElement element = null;
	UtilitiesTestClass utils = new UtilitiesTestClass();
	
	public WebElement loginHeader(WebDriver driver)
	{
		utils.waitForElementToBeLoaded(driver, By.cssSelector(".oxd-text.oxd-text--h5.orangehrm-login-title"));
		element = driver.findElement(By.cssSelector(".oxd-text.oxd-text--h5.orangehrm-login-title"));
		return element;
	}
	
	public WebElement usernameField(WebDriver driver)
	{
		try {
			element = driver.findElement(By.cssSelector("input[placeholder='username']"));
		} catch (Exception e) {
			// TODO: handle exception
			element = driver.findElement(By.cssSelector("input[placeholder='Username']"));
		}
		return element;
	}
	
	public WebElement passwordField(WebDriver driver)
	{
		try {
			element = driver.findElement(By.cssSelector("input[placeholder='password']"));
		} catch (Exception e) {
			// TODO: handle exception
			element = driver.findElement(By.cssSelector("input[placeholder='Password']"));

		}
		return element;
	}
	
	public WebElement loginButton(WebDriver driver)
	{
		element = driver.findElement(By.cssSelector("button[type='submit']"));
		return element;
	}
}
