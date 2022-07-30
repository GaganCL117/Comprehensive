package runner;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import objectPage.CreateNewAccount;
import objectPage.LanguageAndRegion;
import objectPage.LiveChat;
import objectPage.ProductSearch;
import objectPage.ShopProductPacs;
import objectPage.TideDeepClean;
import objectPage.TideHomePage;
import objectPage.TideInSpace;
import objectPage.TideLaundry;
import objectPage.TideLiquidProduct;
import objectPage.TideStainRemoval;
import reusableComponents.BaseClass;
import utility.ExcelData;
import utility.ScreenShotClass;

public class TestExecution extends BaseClass{

	
	@BeforeMethod
	public void initialize() throws Exception {
		driver = connections();
		ExtentTest test = extent.createTest("Browser Initialization");
		driver.get(prop.getProperty("url"));
		log.info("Browser Launched");
		log.info("Tide URL Fetched");
		test.pass("Browser Launched");
		test.pass("Tide URL Fetched");
		TideHomePage thp = new TideHomePage(driver);
		Thread.sleep(1000);
		thp.waitToCancel();
//		Thread.sleep(2000);
		thp.clickOnElement();

	}
	
	ScreenShotClass ssc;
	
	@Test(priority = 1)
	public void createAccount() throws Exception {
		CreateNewAccount cna = new CreateNewAccount(driver);
		ExtentTest test = extent.createTest("Creating New Tide User Account");
		log.info("Creating New Tide User Account");
		ssc = new ScreenShotClass();
		cna.register();
		log.info("Clicked on Register");
		log.info("Clicked on Signup button");
		test.pass("Clicked on Register");
		test.pass("Clicked on Signup button");
		cna.username(prop.getProperty("username"));
		log.info("Enterd User Name");
		test.pass("Enterd User Name");
		Thread.sleep(2000);
		cna.email(prop.getProperty("email"));
		log.info("Enterd Email");
		test.pass("Enterd Email");
		Thread.sleep(2000);
		cna.password(prop.getProperty("password"));
		log.info("Enterd Password");
		test.pass("Enterd Password");
		ssc.screenshots();
		log.info("Took Screenshot");
		test.pass("Took Screenshot");
		Thread.sleep(2000);
		cna.switch1();
		log.info("Validation Pass");
		System.out.println("Validation Pass");
	}
	
	@Test(priority = 2)
	public void shopProductPacsTC1() throws Exception {
		ShopProductPacs spp = new ShopProductPacs(driver);
		ssc = new ScreenShotClass();
		ExtentTest test = extent.createTest("Open Shop Product Pacs");
		spp.moveToShopProducts();
		log.info("Hoverd on Shop Products");
		test.pass("Hoverd on Shop Products");
		spp.clickOnPacs();
		log.info("Clicked on Pacs Products");
		test.pass("Clicked on Pacs Products");
		Thread.sleep(1000);
		spp.retailer();
		log.info("Clicked on Retailers");
		test.pass("Clicked on Retailers");
		ssc.screenshots();
		log.info("Took Screnshot");
		test.pass("Took Screnshot");
		spp.verify();
		log.info("Validation Pass");
		test.pass("Verification successful");
		Thread.sleep(1000);
		spp.close();
	}
	
	@Test(dataProviderClass = ExcelData.class, dataProvider = "SearchPowder", priority = 3)
	public void searchPowder(String powder) throws Exception {
		ProductSearch ps = new ProductSearch(driver);
		ssc = new ScreenShotClass();
		ExtentTest test = extent.createTest("Search for Powder Product");
		ps.searchPowder(powder);
		log.info("Enter Powder in search box");
		test.pass("Enter Powder in search box");
		Thread.sleep(1000);
		ps.products();
		log.info("Click on Products");
		test.pass("Click on Products");
		Thread.sleep(1000);
		ps.findRetailor();
		log.info("Click on Products");
		test.pass("Click on Products");
		ssc.screenshots();
		log.info("Took Screenshot");
		test.pass("Took Screenshot");
		Thread.sleep(1000);
		ps.close();
		log.info("Closed the Tab");
		test.pass("Closed the Tab");
		Thread.sleep(1000);
		ps.verify();
		log.info("Validation Pass");
		test.pass("Verification successful");
	}
	
	@Test(priority = 4)
	public void liveChat() throws Exception {
		LiveChat lc = new LiveChat(driver);
		ssc = new ScreenShotClass();
		ExtentTest test = extent.createTest("Test Live Chat Feature");
		lc.liveChat();
		log.info("Clicked on Live Chat");
		test.pass("Clicked on Live Chat");
		Thread.sleep(2000);
		lc.scrollBack();
		log.info("Navigated Back");
		test.pass("Navigated Back");
		Thread.sleep(1000);
		ssc.screenshots();
		log.info("Took Screenshot");
		test.pass("Took Screenshot");
		lc.verify();
		log.info("Validation Pass");
		test.pass("Verification successful");
		Thread.sleep(2000);
	}
	
	@Test(priority = 5)
	public void Language() throws Exception {
		LanguageAndRegion lar = new LanguageAndRegion(driver);
		ssc = new ScreenShotClass();
		ExtentTest test = extent.createTest("Testing Languages and Region");
		lar.changeLang();
		log.info("Clicked on country name");
		test.pass("Clicked on country name");
		lar.selectLang();
		log.info("Selected new Region");
		test.pass("Selected new Region");
		Thread.sleep(1000);
		ssc.screenshots();
		log.info("Took Screenshot");
		test.pass("Took Screenshot");
		lar.Verify();
		log.info("Validation Pass");
		test.pass("Verification successful");
		lar.select1();
		lar.selectBack();
	}
	
	@Test(priority = 6)
	public void liquidProducts() throws Exception {
		TideLiquidProduct tlp = new TideLiquidProduct(driver);
		ssc = new ScreenShotClass();
		ExtentTest test = extent.createTest("Check for Liquid Products");
		tlp.moveToShopProducts();
		log.info("Hoverd on Shop Products");
		test.pass("Hoverd on Shop Products");
		Thread.sleep(1000);
		tlp.clickOnLiquid();
		log.info("Clicked on Liquids");
		test.pass("Clicked on Liquids");
		Thread.sleep(1000);
		tlp.clickOnSensitive();
		log.info("Clicked on Sensitive option");
		test.pass("Clicked on Sensitive option");
		Thread.sleep(1000);
		ssc.screenshots();
		log.info("Took Screenshot");
		test.pass("Took Screenshot");
		Thread.sleep(1000);
		tlp.verify();
		log.info("Validation Pass");
		test.pass("Verification successful");
		Thread.sleep(1000);
	}
	
	@Test(priority = 7)
	public void stainRemoval() throws Exception {
		TideStainRemoval tsr = new TideStainRemoval(driver);
		ssc = new ScreenShotClass();
		ExtentTest test = extent.createTest("Check for Stain Removal");
		tsr.moveToShopProducts();
		log.info("Hoverd on Shop Products");
		test.pass("Hoverd on Shop Products");
		Thread.sleep(1000);
		tsr.clickOnStainRemoval();
		log.info("Clicked on Stain Removal option");
		test.pass("Clicked on Stain Removal option");
		Thread.sleep(1000);
		ssc.screenshots();
		log.info("Took Screenshot");
		test.pass("Took Screenshot");
		Thread.sleep(1000);
		tsr.verify();
		log.info("Validation Pass");
		test.pass("Verification successful");
		Thread.sleep(2000);
				
	}
	
	@Test(priority = 8)
	public void tideInSpace() throws Exception {
		TideInSpace tis = new TideInSpace(driver);
		ssc = new ScreenShotClass();
		ExtentTest test = extent.createTest("Check for Tide In Space");
		tis.moveToOurCommitment();
		log.info("Hoverd on Our Commitments feature");
		test.pass("Hoverd on Our Commitments feature");
		Thread.sleep(1000);
		tis.clickOnTideInSpace();
		log.info("Clicked on Tide In Space Option");
		test.pass("Clicked on Tide In Space Option");
		Thread.sleep(1000);
		ssc.screenshots();
		log.info("Took Screenshot");
		test.pass("Took Screenshot");
		Thread.sleep(1000);
		tis.verify();
		log.info("Validation Pass");
		test.pass("Verification successful");
		Thread.sleep(2000);
	}
	
	@Test(priority = 9)
	public void tideLaundry() throws Exception {
		TideLaundry tl = new TideLaundry(driver);
		ssc = new ScreenShotClass();
		ExtentTest test = extent.createTest("Check for Tide Laundry");
		tl.moveToHowToWashCloths();
		log.info("Hoverd on How TO Wash CLothes");
		test.pass("Hoverd on How TO Wash CLothes");
		Thread.sleep(1000);
		tl.clickOnLaundry();
		log.info("Clicked on Laundry option");
		test.pass("Clicked on Laundry option");
		Thread.sleep(1000);
		ssc.screenshots();
		log.info("Took Screenshot");
		test.pass("Took Screenshot");
		Thread.sleep(1000);
		tl.verify();
		log.info("Validation Pass");
		test.pass("Verification successful");
		Thread.sleep(1000);
	}
	
	@Test(priority = 10)
	public void tideDeepClean() throws Exception {
		TideDeepClean tdc = new TideDeepClean(driver);
		ssc = new ScreenShotClass();
		ExtentTest test = extent.createTest("Check for Tide Deep Clean");
		tdc.moveToShopProducts();
		log.info("Hoverd on Shop Products feature");
		test.pass("Hoverd on Shop Products feature");
		Thread.sleep(1000);
		tdc.clickOnDeepClean();
		log.info("Clicked on Deep Clean Option");
		test.pass("Clicked on Deep Clean Option");
		Thread.sleep(1000);
		tdc.selectType(prop.getProperty("select"));
		log.info("Selected A-Z alphabetic Filture");
		test.pass("Selected A-Z alphabetic Filture");
		Thread.sleep(1000);
		ssc.screenshots();
		log.info("Validation Pass");
		test.pass("Verification successful");
		Thread.sleep(1000);
		tdc.verify();
		log.info("Validation Pass");
		test.pass("Verification successful");
	}
	
	@AfterMethod
	public void closer() {
		ExtentTest test = extent.createTest("Closing All the active Drivers");
		log.info("Tide Webpage closing");
		log.info("Pushing values to the ExtentReports");
		log.info("Closing Drivers");
		test.pass("Closing WebdDrivers");
		extent.flush();
		driver.quit();
	}
	
}
