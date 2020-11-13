package org.test.testpages;

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
	
	public Logintest(){
		super();
		
	}
	
	@BeforeClass
	public void setupmethod() {
		initialize();
		lp = new Loginpage();
		
	}
	
	@Test(priority=3)
	public void enterUsernametest() {
		
		lp.enterUsername(p1.getProperty("username"));
		
	}
	
	@Test(priority=4)
	public void enterPasswordtest() {
		lp.enterPassword(p1.getProperty("password"));
		
	}
	@Test(priority=5)
	public void clickLogintest() {
		lp.clickLogin();
	}
	
	@Test(priority=1)
	public void titleChecktest() {
		String title = lp.verifyLoginPageTitle();
      System.out.println(title);
	}
	
	
	@Test(priority=2)
	public void textdisptest() {
		Assert.assertTrue(lp.textDisp());
		
	}
	
	@AfterClass
	public void teardown() {
		driver.quit();
	}
	
	

}
