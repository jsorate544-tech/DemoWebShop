package com.demowebshop.pomclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPomClass {
@FindBy(linkText = "Register")
	private WebElement registerLink;
@FindBy(xpath = "//input[@id='FirstName']")
private WebElement Firstname;

@FindBy(xpath = "//input[@id='LastName']")
private WebElement Lastname;

@FindBy(xpath = "//input[@id='Email']")
private WebElement Email;

@FindBy(xpath = "//input[@id='Password']")
private WebElement Password;

@FindBy(xpath = "//input[@id='ConfirmPassword']")
private WebElement Confirmpassword;

@FindBy(xpath = "//input[@id='register-button']")
private WebElement registerbtn;

public WebElement getRegisterLink() {
	return registerLink;
}

public WebElement getFirstname() {
	return Firstname;
}

public WebElement getLastname() {
	return Lastname;
}

public WebElement getEmail() {
	return Email;
}

public WebElement getPassword() {
	return Password;
}

public WebElement getConfirmpassword() {
	return Confirmpassword;
}

public WebElement getRegisterbtn() {
	return registerbtn;
}



}
