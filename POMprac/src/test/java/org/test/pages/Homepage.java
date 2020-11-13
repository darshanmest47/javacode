package org.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.test.base.Testbase;
import org.test.utils.Utils;

public class Homepage extends Testbase {
	
//	public static Utils u;
	public static Contacts c;
	public Actions act;
	

  @FindBy(xpath="//td[text()='CRMPRO']")
  WebElement crmdisp;
  
  @FindBy(xpath="//a[@title='Contacts']")
  WebElement contacts;
  
  @FindBy(xpath="//td[contains(text(),'Demo')]")
  WebElement textdemo;
  
  public Homepage() {
	  PageFactory.initElements(driver, this);
  }
  
  
  public String crmDisp() {
	  new Utils().switchFrame();
	  return crmdisp.getText();
  }
  
  public String getTitlePage() {
	  return driver.getTitle();
	  
  }
  
  public Contacts contactsClick() {
      new Utils().switchFrame();

	  
	  act =new Actions(driver);
	  act.moveToElement(contacts).click().build().perform();
	  
	  c = new Contacts();
	  return c;
	
	 
  }
  
  public boolean usernameDisp() {
	  new Utils().switchFrame();
	  return textdemo.isDisplayed();
  }
  
  
  
  
}
