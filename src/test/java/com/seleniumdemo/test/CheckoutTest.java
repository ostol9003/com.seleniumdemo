package com.seleniumdemo.test;

import com.seleniumdemo.pages.HomePage;
import org.testng.annotations.Test;

public class CheckoutTest extends BaseTest {

    @Test
    public void checkoutTest() {
        new HomePage(driver)
                .openShopPage()
                .openProductPage("Java Selenium WebDriver")
                .addProductToCart()
                .viewCart()
                .openAddressDetails();
    }
}
