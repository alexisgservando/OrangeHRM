/*
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HRMloginPageObjects {
	
	//Creating WebDriver object
	WebDriver driver = null;
	
	//Constructor and passing the WebDriver
	public HRMloginPageObjects(WebDriver driver)
	{
		this.driver = driver;
	}
	
	//Identifying the page web elements
	By field_username = By.cssSelector("input[placeholder='Username']");
	By field_password = By.cssSelector("input[placeholder='Password']");
	By button_login = By.cssSelector("button[type='submit']");
	
	//Functions to perform actions on the previously identified web elements
	public void typeUsername(String username)
	{
		driver.findElement(field_username).sendKeys(username);
	}
	
	public void typePassword(String password)
	{
		driver.findElement(field_username).sendKeys(password);
	}
	
	public void clickLoginButton()
	{
		driver.findElement(button_login).click();
	}
}
*/
