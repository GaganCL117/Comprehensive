package uistore;

import org.openqa.selenium.By;

public class ShopProductPacsUI {

	public static By shopProduct = By.xpath("//a[text()='Shop Products']");
	public static By pacs = By.xpath("(//a[@class='event_menu_click '])[1]");
	public static By findRetailers = By.xpath("(//span[text()='Find Retailers'])[3]");
//	public static By tideSimply = By.cssSelector("h1[class='ps-product-name']");
	public static By close = By.xpath("//span[@class='ps-lightbox-close']");
	public static By chennai = By.xpath("//div[@class='ps-location']");
	
}
