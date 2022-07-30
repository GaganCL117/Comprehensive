package uistore;

import org.openqa.selenium.By;

public class ProductSearchUI {

	public static By input = By.cssSelector("input[name='q']");
	
	public static By button = By.cssSelector("button[class='active-tab']");
	
	public static By findRetailors = By.xpath("(//div[@ps-widget-type='lightbox'])[3]");
	
	public static By close = By.cssSelector("span[class='ps-lightbox-close']");
	
	public static By verify = By.xpath("(//div[@class='col-12'])[1]");
}
