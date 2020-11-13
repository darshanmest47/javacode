package org.test.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testbase {
	public static void main(String[] args) {
		
	}
	public static Properties p1;
	public static WebDriver driver;
	
	public Testbase(){
		
		try {
			p1= new Properties();
			FileInputStream fs = new FileInputStream("E:\\eclipse\\POMprac\\src\\test\\java\\org\\test\\config\\configurations.properties");
			p1.load(fs);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	public void initialize() {
		String browser = p1.getProperty("browser");
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			
		}
		
		driver.get(p1.getProperty("URL"));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

}
