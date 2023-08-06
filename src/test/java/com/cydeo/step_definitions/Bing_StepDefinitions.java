package com.cydeo.step_definitions;

import com.cydeo.pages.BingSearchPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Bing_StepDefinitions {
BingSearchPage bingSearchPage = new BingSearchPage();

    @Given("user is on the Bing search page")
    public void user_is_on_the_bing_search_page() {

        Driver.getDriver().get("https://www.bing.com");

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOf(bingSearchPage.bingSearchBox));
    }

    @When("user enters orange in the search box")
    public void user_enters_in_the_search_box(String string) {
        bingSearchPage.bingSearchBox.sendKeys("orange" + Keys.ENTER);
    }

    @When("user enters {string} in the search box") //you should never touch the signature of the snippet, because this matches with the text of the step definitions.
    public void userEntersInTheSearchBox(String searchKey) {
        bingSearchPage.bingSearchBox.sendKeys(searchKey + Keys.ENTER);

    }


    @Then("user should see orange in the title")
    public void user_should_see_orange_in_the_title() {
        BrowserUtils.verifyTitle("orange - Search");
        //BrowserUtils.verifyTitleContains(expectedTitle);
    }


    @Then("user should see {string} in the title")
    public void userShouldSeeInTheTitle(String expectedTitle) {

        BrowserUtils.verifyTitle(expectedTitle);
        //BrowserUtils.verifyTitleContains(expectedTitle);

    }
}
