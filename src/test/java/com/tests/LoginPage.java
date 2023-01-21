package com.tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.adactin.listeners.TestAllureListeners;
import com.objects.BasePage;
import com.objects.Login;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;


@Listeners({TestAllureListeners.class})
public class LoginPage 
{
		BasePage bp;
		Login l;
		
		public LoginPage()
		{
			bp= new BasePage();
			l= new Login();
		}
				
		@BeforeTest
		public void openBrowser() {
			bp.launch();
		}
				
		@Test(priority = 1, description = "verify the page title")
		@Severity(SeverityLevel.NORMAL)
		@Description("Verify title of the page")
		@Story("Story Name: To check tite")
		public void verifyTitle() {
			l.getTitleOfPage();
		}
		
	
		@Test(priority = 2)
		@Severity(SeverityLevel.NORMAL)
		@Description("Verify Login of the page")
		@Story("Story Name: To check New User link of the application")
		public void verifyNewUSer() {
			l.verifyNewUser();
		}
		
	
		@Test(priority = 3)
		@Severity(SeverityLevel.NORMAL)
		@Description("Verify Login of the page")
		@Story("Story Name: To check Login of the application")
		public void verifyLogin() {
			l.login();
		}
		
		@AfterTest
		public void closeTheBrowser() {
			bp.driver.close();
		}
		
}
