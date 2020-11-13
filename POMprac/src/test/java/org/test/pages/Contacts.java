package org.test.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.base.Testbase;

public class Contacts extends Testbase {
	@FindBy(xpath="//a[text()='Abraham Sarai']/parent::td/parent::tr/td[1]")
	List<WebElement> lists;
	
	public Contacts() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	public void listCount() {
		for(int i=0;i<lists.size();i++) {
			lists.get(i).click();
		}
	}
	
	

}
