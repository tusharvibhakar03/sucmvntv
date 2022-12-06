package com.sauce.demo.testsuite;

import com.sauce.demo.pages.HomePage;
import com.sauce.demo.pages.LoginPage;
import com.sauce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Test

    public void UserSholdLoginSuccessfullyWithValidCredentials(){

       homePage.clickOnLoginLink();
       loginPage.enterEmailId("standard_user");
       loginPage.enterPassword("secret_sauce");
        loginPage.clickOnlogin();

        String expectedText="PRODUCTS";
        String actualText= loginPage.verifyMessage();
        Assert.assertEquals(actualText,expectedText,"PRODUCTS");


    }
    @Test

   public void verifyThatSixProductsAreDisplayedOnPage(){
       homePage.clickOnLoginLink();
       loginPage.enterEmailId("standard_user");
       loginPage.enterPassword("secret_sauce");
       loginPage.clickOnlogin();
       loginPage.verifyMessage();
       Assert.assertEquals(loginPage.verifyNumber(),6,"not verify");





   }


}
