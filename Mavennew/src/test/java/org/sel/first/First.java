package org.sel.first;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class First {
	
	@BeforeSuite
	public void beforesuite() {
		System.out.println("Beforesuite");
	}
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("-------------------");
		System.out.println("before class");
		System.out.println("-------------------");
	}
	
	
	@BeforeMethod
	public void beforemethod() {
		System.out.println("before method first");
	}
	
	@Test(priority = 1)
	public void first() {
		System.out.println("first");
		
	}
	
	@Test(priority = 0)
	public void getm() {
		System.out.println("getm()");
	}
	
	@AfterMethod
	public void aftermethod() {
		System.out.println("after method first");
	}
	
	@AfterClass
	public void afterclass(){
		System.out.println("-------------------");
		System.out.println("afterclass method");
		System.out.println("-------------------");
		
	}
	
	
	@AfterTest
	public void aftertest() {
		System.out.println("-------------------");
		System.out.println("After test");
		System.out.println("-------------------");
	}
	
	

}
