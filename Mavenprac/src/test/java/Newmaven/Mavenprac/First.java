package Newmaven.Mavenprac;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class First {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://makemytrip.com");
		Thread.sleep(10000);
//		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(src, new File("E:\\eclipse\\Mavenprac\\Screenshots\\makemytrip.png"));

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        List<WebElement> frames = driver.findElements(By.tagName("iframe"));
        WebElement ele = driver.findElement(By.xpath("//a[contains(@id,'close-div')]/i[@class='wewidgeticon we_close']"));
 //       WebElement ele1 = driver.findElement(By.xpath("//img[@id='second-img']"));
        
        
      WebDriverWait wt = new WebDriverWait(driver,20);
//      wt.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//img[@id='second-img']")));
//      System.out.println(ele1.isDisplayed());
	    wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@id,'close-div')]/i[@class='wewidgeticon we_close']")));
	    System.out.println("found");
      
       System.out.println(frames);
        
        for(int i=0;i<frames.size();i++) {
        	System.out.println(frames.get(i));
        	
//        	driver.switchTo().frame(i);
//        	if(ele1.isDisplayed()) {
//        
//        	      System.out.println(ele1.isDisplayed());
//        		
//        		driver.switchTo().defaultContent();
//        	}
//        	else {
//        		System.out.println("not displayed");
//        		driver.switchTo().defaultContent();
//        		
//        	}
//        	
        	
        	
        	
        }
		
//		Actions acts = new Actions(driver);
		
//		acts.moveToElement(ele).click().build().perform();
//		ele.click();
		
		
	
		
		
	}

}
