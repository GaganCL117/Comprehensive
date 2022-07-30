package objectPage;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import reusableComponents.HelperClass;
import uistore.LiveChatUI;

public class LiveChat {

	WebDriver driver;

	public LiveChat(WebDriver driver) {
		this.driver = driver;
	}

	HelperClass help = new HelperClass();

	public void liveChat() throws Exception {
		help.click(LiveChatUI.livechat);
	}

	public void scrollBack() throws Exception {
		help.click(LiveChatUI.scrollBack);
	}

	public void verify() {
		String text = help.getText(LiveChatUI.verify);
		System.out.println(text);
		if (text.contains("Then you have come to the right place!")) {
			Assert.assertTrue(true);
			System.out.println("Validation Pass");
		} else {
			Assert.assertTrue(false);
			System.out.println("Validation Fail");
		}
	}
}
