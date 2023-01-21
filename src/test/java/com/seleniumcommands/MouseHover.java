package com.seleniumcommands;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;

public class MouseHover {
	
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://hexaware.com/");

		WebElement element= driver.findElement(By.xpath("//div[@class='footer-social-icon linkedin']"));
		
		Actions ac= new Actions(driver);
		ac.moveToElement(element).perform();
	
		String s=element.getCssValue("color");
		System.out.println(s);
		
		String asHex = Color.fromString(s).asHex();
		System.out.println(asHex);
	}

}
