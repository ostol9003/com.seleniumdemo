package com.seleniumdemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoggedUserPage {

    private WebDriver driver;

    @FindBy(xpath = "//a[text()='Logout']")
    private WebElement entryTitle;

    public LoggedUserPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public WebElement getEntryTitle(){
        return entryTitle;
    }
}
