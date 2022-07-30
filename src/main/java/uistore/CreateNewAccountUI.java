package uistore;

import org.openqa.selenium.By;

public class CreateNewAccountUI {

	public static By register = By.xpath("//a[text()='Register']");
	
	public static By signup = By.cssSelector("a[class='event_internal_link']");
	
	public static By username = By.id("name");
	
	public static By password = By.id("password");
	
	public static By email = By.xpath("//input[@id='email']");
	
	public static By submit = By.cssSelector("input[type='submit']");
	
	public static By verify = By.xpath("//div[@class='w-9/12 mx-auto xxl:w-7/12 lg:px-50 xl:px-30 signupErrorMessage']//div//p");

}
