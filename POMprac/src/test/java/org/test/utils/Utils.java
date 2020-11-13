package org.test.utils;

import org.test.base.Testbase;

public class Utils extends Testbase{
	
	
	public void switchFrame() {
		
		driver.switchTo().frame("mainpanel");
		
	}

}
