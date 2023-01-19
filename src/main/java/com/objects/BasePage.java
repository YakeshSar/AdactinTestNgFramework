package com.objects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
	
	public static WebDriver driver;
	
	public BasePage(){
		System.setProperty("webdriver.chrome.driver", "lib\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	public void launch() {
		driver.get("http://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	public void setValue(WebElement element, String name) {
		element.sendKeys(name);
	}

	
	public String getTitleOfThePage() {
		 return driver.getTitle();
	}
	
	public void clickButton(WebElement element) {
		element.click();
	}
	
	
	
}

