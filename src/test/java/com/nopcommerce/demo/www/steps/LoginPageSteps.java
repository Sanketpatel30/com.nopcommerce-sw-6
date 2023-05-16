package com.nopcommerce.demo.www.steps;

import com.nopcommerce.demo.www.pages.HomePage;
import com.nopcommerce.demo.www.pages.LoginPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LoginPageSteps {
    @And("^I click on the login link$")
    public void iClickOnTheLoginLink() {
        new HomePage().clickOnLoginLink();
    }

    @Then("^I navigate to the Login page and see message \"([^\"]*)\"$")
    public void iNavigateToTheLoginPageAndSeeMessage(String expected) {
        Assert.assertEquals("Login page not displayed", expected, new LoginPage().getWelcomeText());

    }

    @And("^I enter invalid email address \"([^\"]*)\"$")
    public void iEnterInvalidEmailAddress(String email) {
        new LoginPage().enterEmailId(email);
    }

    @And("^I enter invalid password \"([^\"]*)\"$")
    public void iEnterInvalidPassword(String password) {
        new LoginPage().enterPassword(password);
    }

    @And("^I click on login button$")
    public void iClickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("^I get error message \"([^\"]*)\"$")
    public void iGetErrorMessage(String expectedError) {
        Assert.assertTrue("Error message not displayed", new LoginPage().getErrorMessage().contains(expectedError));
    }

    @And("^I enter valid email address \"([^\"]*)\"$")
    public void iEnterValidEmailAddress(String validEmail) {
    }

    @And("^I enter valid password \"([^\"]*)\"$")
    public void iEnterValidPassword(String arg0) {
    }

    @Then("^I am logged in and I can see the logout link in the menu$")
    public void iAmLoggedInAndICanSeeTheLogoutLinkInTheMenu() {
    }

    @And("^I click on the log out link$")
    public void iClickOnTheLogOutLink() {
    }

    @Then("^I am logged out of the account successfully$")
    public void iAmLoggedOutOfTheAccountSuccessfully() {
    }
}
