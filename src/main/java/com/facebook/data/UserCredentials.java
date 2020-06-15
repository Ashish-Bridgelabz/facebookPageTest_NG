package com.facebook.data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserCredentials {
    WebDriver driver;
    //USING FIND BY LOCATING ELEMENTS FOR USERNAME SECTION,PASSWORD SECTION,LOGIN SECTION
    By userName = By.xpath("//*[@id=\"email\"]");
    By Pass = By.xpath("//*[@id=\"pass\"]");
    By loginButton = By.xpath("//*[@id=\"u_0_b\"]");

    //ENTER PARAMETERIZED CONSTRUCTOR
    public UserCredentials(WebDriver driver) {
        this.driver = driver;
    }

    //DEFINGING ALL THE USER ACTIONS (METHOD) THAT CAN BE PERFORMED IN THE FACEBOOK HOME PAGE//
    //THIS METHOD IS TO EMAIL IN THE EMAIL TEXT BOX
    public void userId(String uId) {

        driver.findElement(userName).sendKeys(uId);
    }

    //THIS METHOD IS FOR USER PASSWORD IN THE PASSWORD TEXT BOX
    public void userPass(String Password) {

        driver.findElement(Pass).sendKeys(Password);
    }

    //THIS METHOD IS TO CLICK ON LOGIN BUTTON
    public void clickLogin() {

        driver.findElement(loginButton).click();
    }


}
