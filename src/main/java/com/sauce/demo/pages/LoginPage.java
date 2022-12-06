package com.sauce.demo.pages;

import com.sauce.demo.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By UsernameField = By.name("user-name");

    By passwordField = By.name("password");

    By LOGINbutton = By.id("login-button");

    By PRODUCTMessage = By.xpath("//*[@id=\"header_container\"]/div[2]/span");

    By itemVerify = By.xpath("//div[@class='inventory_item' ]");


    public void enterEmailId(String Username) {
        sendTextToElement(UsernameField, Username);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickOnlogin() {
        clickOnElement(LOGINbutton);


    }

    public String verifyMessage() {
        return getTextFromElement(PRODUCTMessage);
    }


    public int verifyNumber() {
        return getValue(itemVerify);
    }


}