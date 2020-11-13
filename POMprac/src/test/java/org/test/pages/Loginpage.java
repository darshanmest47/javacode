package org.test.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.base.Testbase;

public class Loginpage extends Testbase {
	
	Homepage hp;
	
	@FindBy(xpath="//input[@name='username']")
	WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement login;
	
	@FindBy(xpath="//a/font[text()='Selenium Jobs']")
	WebElement txt;
	
	
	public Loginpage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public  String verifyLoginPageTitle() {
		return driver.getTitle();
	}
	
	public void enterUsername(String name) {
		username.sendKeys(name);
	}
	
	public void enterPassword(String pwd) {
		password.sendKeys(pwd);
	}
	
	public Homepage clickLogin() {
		login.click();
		hp = new Homepage();
		return hp;
	}
	
	public boolean textDisp() {
		return txt.isDisplayed();
	}

}
