package com.nextbase.pages;


import com.nextbase.utilities.driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.sql.Driver;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(driver.getDriver(),this);
    }

    @FindBy (xpath = "//input[@placeholder='Login']")
    public WebElement userNameBox;


    @FindBy (xpath = "//input[@placeholder='Password']")
    public WebElement passwordBox;


}

