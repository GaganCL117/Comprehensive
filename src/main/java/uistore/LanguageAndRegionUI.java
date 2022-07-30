package uistore;

import org.openqa.selenium.By;

public class LanguageAndRegionUI {

	public static By USlang = By.xpath("//div[@class='header-top-bar-right-side d-flex align-items-center']//button[text()='US - English']");
	
	public static By selectLang = By.xpath("//div[@class='location-modal-content-wrapper']//a[3]");
	
	public static By cnLang = By.xpath("//div[@class='header-top-bar-right-side d-flex align-items-center']//button");
	
	public static By selectBack = By.xpath("//div[@class='location-modal-content-wrapper']//a");
	
	public static By gettext = By.xpath("(//div[@class='richtext-container '])[2]//h3");
	
	
	
}
