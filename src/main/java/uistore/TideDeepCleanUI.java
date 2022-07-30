package uistore;

import org.openqa.selenium.By;

public class TideDeepCleanUI {

	public static By shopProduct = By.xpath("//a[text()='Shop Products']");
	
	public static By deepClean = By.xpath("(//span[text()='Deep Clean'])[1]");
	
	public static By select = By.cssSelector("select[name='sortBy']");
	
	public static By verify = By.xpath("//div[@class='plp-title-bar']//h1//p");
	
}
