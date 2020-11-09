import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Googleauto {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\eclipse\\Demopro\\drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("face");
//		driver.findElement(By.id("inputWrapper")).sendKeys("FACE");
		WebDriverWait wt = new WebDriverWait(driver,20);
		wt.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//ul[@role='listbox']")));
		 List<WebElement> listele = driver.findElements(By.xpath("//ul[@role='listbox']/li/div/div[@role='option']/div[1]"));
		 
		 System.out.println(listele.size());
		 
		 for(int i=0;i<listele.size();i++) {
			 System.out.println(listele.get(i).getText());
			 
			 if(listele.get(i).getText().equals("facebook login")) {
				 listele.get(i).click();
				 
				 break;
			 }
			 
			
			 
		
		 }
		 
		 
		 Thread.sleep(10000);
		 driver.quit();
		

}
}
