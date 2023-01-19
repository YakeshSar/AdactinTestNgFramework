package com.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

	public void login() {
		setValue(getUsername(), "Yakesh150720");
		setValue(getPassword(), "Yakesh@1507");
		clickButton(getLoginButton());
	}
	
	
	
}

