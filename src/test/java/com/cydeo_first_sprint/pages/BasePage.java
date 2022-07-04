package com.cydeo_first_sprint.pages;

import com.cydeo_first_sprint.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "login")
    public WebElement emailInput;

    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(css = ".btn-primary")
    public WebElement loginButton;
    @FindBy(css = "#wrapwrap > main > div > form > p")
    public WebElement expectedInvalidInputMessage;


}
