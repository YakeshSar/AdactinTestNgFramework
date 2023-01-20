package com.tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.objects.BasePage;
import com.objects.Login;

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
		
		
		@Test(priority = 1)
		public void verifyTitle() {
			String titleOfThePage = bp.getTitleOfThePage();
			System.out.println(titleOfThePage);
		}
		
		@Test(priority = 2)
		public void verifyNewUSer() {
			WebElement newUser = l.getNewUser();
			System.out.println(newUser.getText());
		}
		
		@Test(priority = 3)
		public void verifyLogin() {
			l.login();
		}
		
		@AfterTest
		public void closeTheBrowser() {
			bp.driver.close();
		}
		
}
