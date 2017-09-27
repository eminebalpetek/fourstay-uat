package com.fourstay.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fourstay.utilities.Driver;

public class LoginPage {
	private WebDriver driver;

	public LoginPage() {
		this.driver = Driver.getInstance();
		PageFactory.initElements(driver, this);// you can write only one line
												// instead
		// driver>>Driver.getInstance()
		// so one line PageFactory.initElements(Driver.getInstance(), this)
	}

	@FindBy(css = "li[data-target='#modal-login']")
	public WebElement login;

	@FindBy(id = "email")
	public WebElement email;

	@FindBy(id = "key")
	public WebElement password;

	@FindBy(id = "btn-login")
	public WebElement login2;

	@FindBy(css = ".user-name")
	public WebElement myAccountName;

	// "h3.user-name.ng-binding"
	@FindBy(css = "a[id='btn-logout']")
	public WebElement logout;

	@FindBy(css = "li[data-target='#modal-signup']")
	public WebElement signup;
}
