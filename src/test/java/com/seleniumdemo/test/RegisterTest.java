package com.seleniumdemo.test;

import com.seleniumdemo.pages.HomePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends BaseTest {

    @Test
    public void registerUserTest() {
        int random = (int) (Math.random()*1000);

        WebElement logoutLink = new HomePage(driver).openMyAccountPage()
                .registerUser("test"+random+"@test.pl", "test@test.pl").getLogoutLink();

        Assert.assertEquals(logoutLink.getText(), "Logout");
    }
    @Test
    public void registerUserWithSameEmailTest() {
        WebElement logoutLink = new HomePage(driver).openMyAccountPage()
                .registerUser("test@test.pl", "test@test.pl").getError();

        Assert.assertTrue(logoutLink.getText().contains("account is already registered"));
    }

}
