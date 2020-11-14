package org.test.testpages;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.test.base.Testbase;
import org.test.pages.Contacts;
import org.test.pages.Homepage;
import org.test.pages.Loginpage;
import org.test.utils.Utils;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Hometest extends Testbase {
	public static Loginpage lp;
	public static Homepage hp;
	Logger logger;
	
	
	public Hometest(){
		super();
		 logger = LogManager.getLogger(Hometest.class.getName());
	}
	
	
	@BeforeMethod
	public void setup() {
		initialize();
		lp = new Loginpage();
		lp.enterUsername(p1.getProperty("username"));
		lp.enterPassword(p1.getProperty("password"));
		hp=lp.clickLogin();
		
		
	}
	
	@Test(priority=3)
	public void crmDisptest() {
		System.out.println(hp.crmDisp());
		logger.info(hp.crmDisp());
		
	}
	
	@Test(priority=2)
	public void usernameDisptest() {
		Assert.assertTrue(hp.usernameDisp());
		logger.info(hp.usernameDisp());
	}
	
	@Test(priority=1)
	public void verifyTitletest() {
		String title = hp.getTitlePage();
		Assert.assertEquals(title, "CRMPRO");
		logger.info(title);
	}
	
	@Test(priority=4)
	public void clickContacttest() {
	
		hp.contactsClick();
		logger.info("clicked on contacts");
		
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException {
		
		driver.quit();
	}
	
	

}
