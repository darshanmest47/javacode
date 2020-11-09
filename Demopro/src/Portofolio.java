import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Portofolio {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\eclipse\\Demopro\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mynewportofolio.herokuapp.com");
		
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		System.out.println(frames.size());
		
//		for(int j=0;j<frames.size();j++) {
//			System.out.println(frames.get(j).getAttribute("src").contains("covidtracker"));
//			
//			if(frames.get(j).getAttribute("src").contains("covidtracker")) {
//				
//				driver.switchTo().frame(0);
//			}
//			
//			
//		}
		
//		driver.switchTo().frame(0);
//		System.out.println(driver.findElement(By.xpath("//h5[text()='Total Statistics For India... ']")).getText());
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.switchTo().frame(1);
		System.out.println(driver.findElement(By.xpath("//div[@class='nav-div']/h4[text()='React-Quiz']")).getText());
		
		
		Thread.sleep(2000);
		driver.quit();
	}

}
