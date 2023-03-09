package com.seleniumdemo.test;

import com.seleniumdemo.pages.HomePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void loginValidDataTest() {
        WebElement loginUserValidData = new HomePage(driver)
                .openMyAccountPage()
                .loginUserValidData("test@test.pl", "test@test.pl")
                .getLogoutLink();

        Assert.assertEquals(loginUserValidData.getText(), "Logout");
    }

    @Test
    public void loginInvalidDataTest() {
        WebElement loginUserInvalidData = new HomePage(driver)
                .openMyAccountPage()
                .loginUserInvalidData("test", "test")
                .getLoginError();

        Assert.assertTrue(loginUserInvalidData.getText().contains("Incorrect username or password"), "Expected text doesn't match");
    }
}
