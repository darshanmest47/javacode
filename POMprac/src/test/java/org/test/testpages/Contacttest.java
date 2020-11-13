package org.test.testpages;

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
	public Contacttest() {
		super();
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
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException {
		Thread.sleep(20000);
		driver.quit();
	}

}
