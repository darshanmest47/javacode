package org.test.testpages;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.test.base.Testbase;
import org.test.pages.Loginpage;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Logintest extends Testbase {
	Loginpage lp;
	Logger logger;

	
	public Logintest(){
		super();
		logger = LogManager.getLogger(Logintest.class.getName());
	}
	
	@BeforeClass
	public void setupmethod() {
		initialize();
		lp = new Loginpage();
		
	}
	
	@Test(priority=3)
	public void enterUsernametest() {
		
		lp.enterUsername(p1.getProperty("username"));
		logger.info("Entered username "+p1.getProperty("username"));
		
	}
	
	@Test(priority=4)
	public void enterPasswordtest() {
		lp.enterPassword(p1.getProperty("password"));
		logger.info("Entered password"+p1.getProperty("password"));
		
	}
	@Test(priority=5)
	public void clickLogintest() {
		lp.clickLogin();
		logger.info("clicked login");
	}
	
	@Test(priority=1)
	public void titleChecktest() {
		String title = lp.verifyLoginPageTitle();
      logger.info("title is "+title);
	}
	
	
	@Test(priority=2)
	public void textdisptest() {
		Assert.assertTrue(lp.textDisp());
		logger.info(lp.textDisp());
		
	}
	
	@AfterClass
	public void teardown() {
		driver.quit();
	}
	
	

}
