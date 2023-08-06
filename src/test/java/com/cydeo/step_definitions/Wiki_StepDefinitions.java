package com.cydeo.step_definitions;

import com.cydeo.pages.WikiPage;
import com.cydeo.pages.WikiResultPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Wiki_StepDefinitions {
    WikiPage wikiPage = new WikiPage();
    WikiResultPage wikiResultPage = new WikiResultPage();

    WebDriverWait webDriverWait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));

    @Given("User is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        Driver.getDriver().get("https://wikipedia.org");
    }

    @When("User types {string} in the wiki search box")
    public void userTypesInTheWikiSearchBox(String arg0) {
        wikiPage.searchBox.sendKeys("Steve Jobs");
    }

    @When("User clicks wiki search button")
    public void user_clicks_wiki_search_button() {
        wikiPage.searchButton.click();
    }


    @Then("User sees {string} is in the wiki title")
    public void userSeesIsInTheWikiTitle(String expectedInTitle) {
        Driver.getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        BrowserUtils.verifyTitleContains(expectedInTitle);
    }


    @Then("User sees {string} is in the main header")
    public void userSeesIsInTheMainHeader(String expectedHeader) {
        String actualHeaderText = wikiResultPage.mainHeader.getText();
        Assert.assertEquals(expectedHeader, actualHeaderText);

    }

    @Then("User sees {string} is in the image header")
    public void userSeesIsInTheImageHeader(String expectedImageHeader) {
        String actualImageHeaderText = wikiResultPage.imageHeader.getText();
        Assert.assertEquals(expectedImageHeader, actualImageHeaderText);

    }
}
