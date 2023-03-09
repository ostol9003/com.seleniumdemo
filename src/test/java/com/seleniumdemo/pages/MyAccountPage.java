package com.seleniumdemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {
    @FindBy(id = "reg_email")
    private WebElement regEmailInput;

    @FindBy(id = "reg_password")
    private WebElement regPasswordInput;

    @FindBy(name = "register")
    private WebElement registerBtn;

    @FindBy(xpath = "//li[text()[contains(.,'account')]]")
    private WebElement error;

    @FindBy(id = "username")
    private WebElement usernameInput;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(xpath = "//button[@value='Log in']")
    private WebElement buttonLogin;

    @FindBy(xpath = "//li[text()[contains(.,'Incorrect username or password')]]")
    private WebElement loginError;
    private WebDriver driver;

    public MyAccountPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public LoggedUserPage registerUserValidData(String email, String password) {
        registerUser(email, password);
        return new LoggedUserPage(driver);
    }

    public MyAccountPage registerUserInvalidData(String email, String password) {
        registerUser(email, password);
        return this;
    }

    private void registerUser(String email, String password) {
        regEmailInput.sendKeys(email);
        regPasswordInput.sendKeys(password);
        registerBtn.click();
    }

    public WebElement getError() {
        return error;
    }

    private void loginUser(String email, String password) {
        usernameInput.sendKeys(email);
        passwordInput.sendKeys(password);
        buttonLogin.click();
    }

    public LoggedUserPage loginUserValidData(String email, String password) {
        loginUser(email, password);
        return new LoggedUserPage(driver);
    }

    public MyAccountPage loginUserInvalidData(String email, String password) {
        loginUser(email, password);
        return this;
    }

    public WebElement getLoginError() {
        return loginError;
    }
}
