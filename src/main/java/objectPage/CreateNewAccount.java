package objectPage;

import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.net.OlderWindowsVersionEphemeralPortDetector;
import org.testng.Assert;

import reusableComponents.HelperClass;
import uistore.CreateNewAccountUI;

public class CreateNewAccount {

	WebDriver driver;

	public CreateNewAccount(WebDriver driver) {
		this.driver = driver;
	}

	HelperClass help = new HelperClass();

	String oldWindow;
	public void register() throws Exception {
		help.click(CreateNewAccountUI.register);
		Thread.sleep(2000);
		help.click(CreateNewAccountUI.signup);
		Thread.sleep(3000);
		oldWindow = driver.getWindowHandle();
		Set<String> newWindows = driver.getWindowHandles();
		for (String lv : newWindows) {
			driver.switchTo().window(lv);
			if (lv.equals(oldWindow)) {
				driver.switchTo().window(lv);
			}
		}
//		help.sendkeys(CreateNewAccountUI.username, text);
//		Thread.sleep(2000);
//		help.sendkeys(CreateNewAccountUI.email, text1);
	}

	public void username(String text) throws InterruptedException {
		help.sendkeys(CreateNewAccountUI.username, text);
	}

	public void email(String text) {

		help.sendkeys(CreateNewAccountUI.email, text);
	}

	public void password(String text) throws Exception {
		help.sendkeys(CreateNewAccountUI.password, text);
//		help.click(CreateNewAccountUI.submit);
	}
	
	public void switch1() {
	driver.close();
	driver.switchTo().window(oldWindow);
	}

//	public void verify() {
//		String val = help.getText(CreateNewAccountUI.verify);
//		System.out.println(val);
//		if (val.contains("this email cannot be registered")) {
//			Assert.assertTrue(true);
//			System.out.println("Validation pass");
//		} else {
//			Assert.assertTrue(false);
//			System.out.println("Validation Fail");
//		}
//	}
	
}
