package com.nextbase.pages;

import com.nextbase.utilities.driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Poll_Page {
    public Poll_Page(){
        PageFactory.initElements(driver.getDriver(), this);
    }

    @FindBy ( id = "feed-add-post-form-tab-vote")
    public WebElement PollButton;


}
