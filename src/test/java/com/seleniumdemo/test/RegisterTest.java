package com.seleniumdemo.test;

import com.seleniumdemo.pages.HomePage;
import org.testng.annotations.Test;

public class RegisterTest extends BaseTest{

    @Test
    public void registerUserTest(){

        new HomePage(driver).openMyAccountPage()
                .registerUser("test@test.pl","test@test.pl");

    }
}
