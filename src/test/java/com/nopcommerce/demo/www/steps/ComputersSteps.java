package com.nopcommerce.demo.www.steps;

import com.nopcommerce.demo.www.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.www.pages.ComputersPage;
import com.nopcommerce.demo.www.pages.DesktopsPage;
import com.nopcommerce.demo.www.pages.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class ComputersSteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I click on Computers menu tab$")
    public void iClickOnComputersMenuTab() {
        new HomePage().clickOnMenuTab("Computers");
    }

    @Then("^I am navigated to the Computers page successfully$")
    public void iAmNavigatedToTheComputersPageSuccessfully() {
        Assert.assertEquals("Computers", "Computers page is not displayed", new ComputersPage().getPageTitleText());

    }

    @And("^I click on Desktops sub menu$")
    public void iClickOnDesktopsSubMenu() {
        new ComputersPage().clickOnSubMenu("Desktops");
    }

    @And("^I select Processor \"([^\"]*)\"$")
    public void iSelectProcessor(String processor)  {
        new BuildYourOwnComputerPage().selectProcessor(processor);
    }

    @And("^I select Ram \"([^\"]*)\"$")
    public void iSelectRam(String ram)  {
        new BuildYourOwnComputerPage().selectRam(ram);
    }

    @And("^I select HDD \"([^\"]*)\"$")
    public void iSelectHDD(String hdd)  {
        new BuildYourOwnComputerPage().selectHDD(hdd);
    }

    @And("^I select OS \"([^\"]*)\"$")
    public void iSelectOS(String os)  {
        new BuildYourOwnComputerPage().selectOS(os);
    }

    @And("^I select Software \"([^\"]*)\"$")
    public void iSelectSoftware(String software)  {
        new BuildYourOwnComputerPage().selectSoftware(software);
    }

    @And("^I click on add to cart button$")
    public void iClickOnAddToCartButton() {
        new BuildYourOwnComputerPage().clickOnAddToCartButton();
    }

    @Then("^The product is added to cart successfully$")
    public void theProductIsAddedToCartSuccessfully() {
        Assert.assertEquals("The product has been added to your shopping cart","Product is not added to cart",new BuildYourOwnComputerPage().getProductAddedMessage());

    }

    @Then("^I am navigated to the Desktops page successfully$")
    public void iAmNavigatedToTheDesktopsPageSuccessfully() {
        Assert.assertEquals(" Desktops", "Desktops page is not displayed", new DesktopsPage().getPageTitleText());

    }

    @And("^I select Product Build your own computer$")
    public void iSelectProductBuildYourOwnComputer() {
        new DesktopsPage().selectProduct("Build your own computer");
    }

}
