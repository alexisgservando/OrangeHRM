package utilities;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UtilitiesTestClass {
	
	public void waitForElementToBeLoaded(WebDriver driver, By by)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5000));
		wait.until(ExpectedConditions.elementToBeClickable(by));
	}
}
