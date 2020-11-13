package org.test.testpages;


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
	
	
	public Hometest(){
		super();
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
		
	}
	
	@Test(priority=2)
	public void usernameDisptest() {
		Assert.assertTrue(hp.usernameDisp());
	}
	
	@Test(priority=1)
	public void verifyTitletest() {
		String title = hp.getTitlePage();
		Assert.assertEquals(title, "CRMPRO");
	}
	
	@Test(priority=4)
	public void clickContacttest() {
	
		hp.contactsClick();
		
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException {
		
		driver.quit();
	}
	
	

}
