package com.seleniumdemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class OrderDetails {
    private WebDriver driver;
    public OrderDetails(WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }
}
