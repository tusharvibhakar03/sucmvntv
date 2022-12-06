package com.sauce.demo.pages;

import com.sauce.demo.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By LOGINbutton = By.id("login-button");

    public void clickOnLoginLink(){
        clickOnElement(LOGINbutton);
    }


}






