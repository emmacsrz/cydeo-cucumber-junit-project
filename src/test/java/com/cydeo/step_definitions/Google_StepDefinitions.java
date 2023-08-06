package com.cydeo.step_definitions;

import com.cydeo.pages.GoogleSearchPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Google_StepDefinitions {
    GoogleSearchPage googleSearchPage = new GoogleSearchPage();

    @When("user searches for apple")
    public void user_searches_for_apple() {
        googleSearchPage.searchBox.sendKeys("apple" + Keys.ENTER);
    }

    @Then("user should see apple in the title")
    public void user_should_see_apple_in_the_title() {
        BrowserUtils.verifyTitle("apple - Google Search");
    }


    @When("user is on the google search page")
    public void user_is_on_the_google_search_page() {
        // Write code here that turns the phrase above into concrete actions
        Driver.getDriver().get("https://google.com");

    }

    @Then("user should see title is {word}")
    public void user_should_see_title_is_google(String word) {
        // Write code here that turns the phrase above into concrete actions
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle, word);

    }


}
