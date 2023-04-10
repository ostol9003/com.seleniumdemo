package com.seleniumdemo.pages;

import com.seleniumdemo.utils.SeleniumHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ProductListPage {

    private WebDriver driver;

    public ProductListPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public ProductPage openProductPage(String title){
        By prodXpath = By.xpath("//h2[text()='"+ title + "']");
        SeleniumHelper.waitForClickable(prodXpath,driver);
        driver.findElement(prodXpath).click();
        return new ProductPage(driver);
    }
}
