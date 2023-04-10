package com.seleniumdemo.test;

import com.seleniumdemo.models.Customer;
import com.seleniumdemo.pages.HomePage;
import com.seleniumdemo.pages.OrderDetailsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckoutTest extends BaseTest {

    @Test
    public void checkoutTest() {
        Customer customer = new Customer();

        OrderDetailsPage orderDetailsPage = new HomePage(driver)
                .openShopPage()
                .openProductPage("Java Selenium WebDriver")
                .addProductToCart()
                .viewCart()
                .openAddressDetails()
                .fillAddress(customer, "some comment");

        Assert.assertEquals(orderDetailsPage.getOrderNotice().getText(),"Thank you. Your order has been received.");
        Assert.assertEquals(orderDetailsPage.getProductName().getText(),"Java Selenium WebDriver × 1");
    }

}
