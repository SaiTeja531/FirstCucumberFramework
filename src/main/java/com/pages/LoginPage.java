package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	private WebDriver driver;
	
	//1. By Locators:
	private By emailId = By.id("email");
	private By password = By.id("passwd");
	private By signInButton = By.id("SubmitLogin");
	private By forgotPswdLink = By.linkText("Forgot your password?");
	
	//2.Constructor of the page class:
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	//3.page actions : Behavior of the page in the form of methods
	public String getLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean isForgotPwdLinkExist() {
		return driver.findElement(forgotPswdLink).isDisplayed();
	}
	
	public void enterUserName(String Username) {
		driver.findElement(emailId).sendKeys(Username);
	}
	
	public void enterPassword(String Pwd) {
		driver.findElement(password).sendKeys(Pwd);
	}
	
	public void clickOnLogin() {
		driver.findElement(signInButton).click();
	}
	
	public AccountsPage doLogin(String user, String passwd) {
		driver.findElement(emailId).sendKeys(user);
		driver.findElement(password).sendKeys(passwd);
		driver.findElement(signInButton).click();
		return new AccountsPage(driver);
	}

}
