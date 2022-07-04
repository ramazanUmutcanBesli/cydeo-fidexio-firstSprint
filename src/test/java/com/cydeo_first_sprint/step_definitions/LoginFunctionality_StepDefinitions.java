package com.cydeo_first_sprint.step_definitions;

import com.cydeo_first_sprint.pages.BasePage;
import com.cydeo_first_sprint.pages.HomePage;
import com.cydeo_first_sprint.pages.ResetPasswordPage;
import com.cydeo_first_sprint.utilities.BrowserUtils;
import com.cydeo_first_sprint.utilities.ConfigurationReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class LoginFunctionality_StepDefinitions {
    BasePage basePage = new BasePage();
    ResetPasswordPage resetPasswordPage = new ResetPasswordPage();
    HomePage homePage = new HomePage();

    @Given("user is on the login page")
    public void userIsOnTheLibraryLoginPage() {
        BrowserUtils.BasePageAchieve();
    }

    @When("user enter a valid {string} inside of the email Box")
    public void user_enter_a_valid_inside_of_the_email_box(String string) {
        basePage.emailInput.sendKeys(string);
    }

    @When("user click on login button successfully")
    public void user_click_on_login_button_successfully() {
        basePage.loginButton.click();
    }

    @Then("user should see home page of fidexio Website")
    public void user_should_see_home_page_of_fidexio_website() {
        Assert.assertTrue(homePage.verifyButton.isDisplayed());
    }

    @And("user enter a valid {string} inside of the password Box")
    public void userEnterAValidInsideOfThePasswordBox(String string) {
        basePage.passwordInput.sendKeys(string);
    }

    @And("user enter a invalid {string} inside of the password Box")
    public void userEnterAInvalidInsideOfThePasswordBox(String arg0) {
        basePage.passwordInput.sendKeys(arg0);

    }

    @Then("user should see Wrong login password Message")
    public void userShouldSeeWrongLoginPasswordMessage() {
        BrowserUtils.verifyTitle(basePage.expectedInvalidInputMessage.getText(),ConfigurationReader.getProperty("expected.title.for.invalid.input"));
    }

    @When("user enter a invalid {string} inside of the email Box")
    public void userEnterAInvalidInsideOfTheEmailBox(String arg0) {
        basePage.emailInput.sendKeys(arg0);
    }

    @When("user enter no data inside of the Email Box")
    public void userEnterNoDataInsideOfTheEmailBox() {
        basePage.emailInput.sendKeys("");
    }

    @Then("User should see {string} Message")
    public void userShouldSeeMessage(String arg0) {
        //TODO: buraya verify kısmını unutma
    }

    @And("user enter no data inside of the password Box")
    public void userEnterNoDataInsideOfThePasswordBox() {
        basePage.passwordInput.sendKeys("");
    }

    @When("user click on {string} text on the home page")
    public void userClickOnTextOnTheHomePage(String arg0) {
        resetPasswordPage.resetButton.click();
    }

    @Then("user should be able to landing on {string} page")
    public void userShouldBeAbleToLandingOnPage(String arg0) {
        Assert.assertTrue(resetPasswordPage.confirmButton.isDisplayed());
    }

    @Then("user should see its password as a Bullet sign by Default")
    public void userShouldSeeItsPasswordAsABulletSignByDefault() {
        Assert.assertEquals("password", basePage.passwordInput.getAttribute("type"));
    }

    @And("user push enter key of the Keyboard to retrieve home page")
    public void userPushEnterKeyOfTheKeyboardToRetrieveHomePage() {
        basePage.passwordInput.sendKeys(Keys.ENTER);
    }


}
