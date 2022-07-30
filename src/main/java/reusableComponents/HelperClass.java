package reusableComponents;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class HelperClass extends BaseClass {

	public void click(By element) throws Exception {
		try {
			driver.findElement(element).click();
		} catch (ElementNotInteractableException e) {
			throw new Exception(e);
		}

//		driver.findElement(element).click();
	}

	WebDriverWait wait;

	public void explicitWaite(By element) throws Exception {
		wait = new WebDriverWait(driver, 10);
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(element));
		} catch (TimeoutException e) {
			throw new Exception(e);
		}

//		wait.until(ExpectedConditions.visibilityOfElementLocated(element));

	}

	public void hover(By element) throws Exception {
		try {
			WebElement ele = driver.findElement(element);
			Actions a = new Actions(driver);
			a.moveToElement(ele).build().perform();
		} catch (Exception e) {
			throw new Exception(e);
		}
	}

	public void maxWindow() {
		driver.manage().window().maximize();
	}

	public boolean isDisplayed(By element) {
		boolean value = driver.findElement(element).isDisplayed();

		return value;
	}

	public String getText(By element) {
		return driver.findElement(element).getText();
	}

	public void sendkeysAndEnter(By element, String text) {
		driver.findElement(element).sendKeys(text, Keys.ENTER);
	}

	public void sendkeys(By element, String text) {
		driver.findElement(element).sendKeys(text);
	}

	public void selection(By element, String value) {
		WebElement ele = driver.findElement(element);
		Select s = new Select(ele);
		s.selectByValue(value);
	}

	public void alertPopups() {
		Alert a = driver.switchTo().alert();
		a.accept();
	}
	

}
