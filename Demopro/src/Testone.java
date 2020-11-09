import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Testone {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "E:\\eclipse\\Demopro\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement ele = driver.findElement(By.xpath("//input[@name='userid']"));
		ele.sendKeys("Darshan");
		Thread.sleep(2000);
		ele.sendKeys(Keys.chord(Keys.CONTROL,"a"));
		Thread.sleep(2000);
		ele.sendKeys(Keys.chord(Keys.CONTROL,"c"));
		Thread.sleep(2000);
		WebElement passwd = driver.findElement(By.xpath("//input[@name='pswrd']"));
		passwd.sendKeys(Keys.chord(Keys.CONTROL,"v"));
		Thread.sleep(2000);
	
		
		
		Actions acts = new Actions(driver);
		Thread.sleep(2000);
		acts.sendKeys(Keys.TAB).build().perform();;
		acts.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		Alert al = driver.switchTo().alert();
		System.out.println(al.getText());
		al.accept();
		Thread.sleep(5000);
		driver.quit();

		
	}

}
