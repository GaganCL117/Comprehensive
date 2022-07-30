package uistore;

import org.openqa.selenium.By;

public class LiveChatUI {
	
	public static By livechat = By.xpath("//a[text()='Live Chat']");
	
	public static By scrollBack = By.cssSelector("button[class='scroll-to-top-btn event_button_click']");
	
	public static By verify = By.xpath("(//div[@class='richtext-container '])[1]//h4[3]");

}
