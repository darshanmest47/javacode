package org.test.testpages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.test.base.Testbase;
import org.test.pages.Contacts;
import org.test.pages.Homepage;
import org.test.pages.Loginpage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Contacttest extends Testbase {
	public static Loginpage lp;
	public static Homepage hp;
	public static Contacts cp;
	Logger logger;
	public Contacttest() {
		super();
		 logger = LogManager.getLogger(Contacttest.class.getName());
	}
	
	@BeforeMethod
	public void setup() {
		initialize();
		lp= new Loginpage();
		lp.enterUsername(p1.getProperty("username"));
		lp.enterPassword(p1.getProperty("password"));
		hp=lp.clickLogin();
		cp= hp.contactsClick();
		
	}
	
	@Test
	public void checknames() {
		cp.listCount();
		logger.info("Checked all the names");
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(20000);
		driver.quit();
	}

}
