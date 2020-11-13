package org.sel.first;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Firstone {
	
	@AfterSuite
	public void aftersuite() {
		System.out.println("aftersuite");
	}
	@BeforeTest
	public void beforetest() {
		System.out.println("-------------------");
		System.out.println("befortest");
		System.out.println("-------------------");
	}
	
	@BeforeMethod
	public void beforemethod() {
		System.out.println("before method firstone");
	}
	
	
	@Test
	public void firstone() {
		System.out.println("firstone");
	}
	
	@AfterMethod
	public void aftermethod() {
		System.out.println("after method firstone");
	}
	
	

}
