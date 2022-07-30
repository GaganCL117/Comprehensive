package uistore;

import org.openqa.selenium.By;

public class TideLiquidProductUI {

	public static By shopProduct = By.xpath("//a[text()='Shop Products']");
	
	public static By liquid = By.xpath("(//span[text()='Liquid'])[1]");
	
	public static By sensitive = By.xpath("//div[@class='plp-filter-bar-buttons']//a[3]");
	
	public static By verify = By.xpath("//div[@class='plp-title-bar']//h1//p");
	
}
