package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.UtilitiesTestClass;

public class DashboardPage {
	
	private static WebElement element = null;
	UtilitiesTestClass utils = new UtilitiesTestClass();
	
	public WebElement dashboardHeader(WebDriver driver)
	{
		utils.waitForElementToBeLoaded(driver, By.cssSelector(".oxd-text.oxd-text--h6.oxd-topbar-header-breadcrumb-module"));
		element = driver.findElement(By.cssSelector(".oxd-text.oxd-text--h6.oxd-topbar-header-breadcrumb-module"));
		return element;
	}
}
