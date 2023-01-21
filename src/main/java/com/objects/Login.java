package com.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.qameta.allure.Step;

public class Login extends BasePage{

	public Login(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="login")
	private WebElement loginButton;
	
	@FindBy(linkText = "New User Register Here")
	private WebElement newUser;
	
	@FindBy(id ="username_show")
	private WebElement username_show;
	

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}
	
	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getNewUser() {
		return newUser;
	}
	
	public WebElement getUsername_show() {
		return username_show;
	}

	

	@Step("verify the username {0} and password {1}")
	public void login() {
		setValue(getUsername(), "Yakesh150720");
		setValue(getPassword(), "Yakesh#1507");
		clickButton(getLoginButton());
		System.out.println(getUsername_show().getAttribute("value"));
	}
	

	@Step("verify the page of title")
	public void getTitleOfPage() {
		String titleOfThePage = driver.getTitle();
		System.out.println(titleOfThePage);
	}
	
	@Step("Verify the new user link")
	public void verifyNewUser() {
		WebElement newUser = getNewUser();
		System.out.println(newUser.getText());
	}
	
}

