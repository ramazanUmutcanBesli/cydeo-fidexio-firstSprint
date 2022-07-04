package com.cydeo_first_sprint.pages;

import com.cydeo_first_sprint.utilities.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResetPasswordPage extends BasePage {
    public ResetPasswordPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = ".btn-link")
    public WebElement resetButton;
    @FindBy(id = "login")
    public WebElement yourEmailBox;

    @FindBy(css = ".btn-primary")
    public WebElement confirmButton;


}
