package com.cydeo.step_definitions;

import com.cydeo.pages.EtsyPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Etsy_StepDefinitions {
EtsyPage etsyPage = new EtsyPage();

    @Given("user is on the Etsy homepage")
    public void user_is_on_the_etsy_homepage() {
        Driver.getDriver().get("https://www.etsy.com");
    }

    @Then("user should see title is as expected")
    public void user_should_see_title_is_as_expected() {
        String expectedTitle = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
        BrowserUtils.verifyTitle(expectedTitle);
    }

    @When("user types Wooden Spoon in the search box")
    public void user_types_wooden_spoon_in_the_search_box() {
        etsyPage.etsySearchBox.sendKeys("Wooden Spoon");
    }
    @When("user clicks search button")
    public void user_clicks_search_button() {
        etsyPage.etsySearchButton.click();
    }

    @Then("user should see Wooden Spoon in the title")
    public void user_should_see_wooden_spoon_in_the_title() {
       BrowserUtils.verifyTitle("Wooden spoon - Etsy");

    }

    @Then("user should see {string} in the Etsy title")
    public void userShouldSeeInTheEtsyTitle(String expectedTitle) {
        BrowserUtils.verifyTitle(expectedTitle);
    }

    @When("user types {string} in the search box")
    public void userTypesInTheSearchBox(String etsySearchArgs) {
        etsyPage.etsySearchBox.sendKeys(etsySearchArgs);
    }
}
