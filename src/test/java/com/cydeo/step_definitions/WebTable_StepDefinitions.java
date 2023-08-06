package com.cydeo.step_definitions;

import com.cydeo.pages.WT_BasePage;
import com.cydeo.pages.WT_LoginPage;
import com.cydeo.pages.WT_OrderPage;
import com.cydeo.pages.WT_ViewAllOrdersPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Map;

public class WebTable_StepDefinitions {
    WT_LoginPage WTLoginPage = new WT_LoginPage();
    WT_BasePage wtBasePage = new WT_BasePage();
    WT_OrderPage wtOrderPage = new WT_OrderPage();


    @Given("user is on the Web Table app login page")
    public void user_is_on_the_web_table_app_login_page() {
        Driver.getDriver().get("https://web-table-2.cydeo.com/login");
    }

    @When("user enters correct username")
    public void user_enters_correct_username() {
        WTLoginPage.usernameBox.sendKeys("Test");
    }

    @When("user enters correct password")
    public void user_enters_correct_password() {
        WTLoginPage.passwordBox.sendKeys("Tester");
    }

    @When("user clicks login button")
    public void user_clicks_login_button() {
        WTLoginPage.loginButton.click();
    }

    @Then("User should see orders word in the URL")
    public void user_should_see_orders_word_in_the_url() {
        String actualURL = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualURL.contains("orders"));
    }

    @When("user enters {string} as username")
    public void userEntersAsUsername(String username) {
        WTLoginPage.usernameBox.sendKeys(username);
    }

    @And("user enters {string} as password")
    public void userEntersAsPassword(String password) {
        WTLoginPage.passwordBox.sendKeys(password);
    }

    @When("user enters below correct credentials")
    public void userEntersBelowCorrectCredentials(Map<String, String> loginCredentials) {
        WTLoginPage.usernameBox.sendKeys(loginCredentials.get("username"));
        WTLoginPage.passwordBox.sendKeys(loginCredentials.get("password"));
    }


    @Given("user is already logged in to The Web table app")
    public void user_is_already_logged_in_to_the_web_table_app() {
        Driver.getDriver().get("https://web-table-2.cydeo.com/login");
        WTLoginPage.login("Test", "Tester");
    }


    @When("user is on the Order page")
    public void user_is_on_the_order_page() {
        wtBasePage.orderPageLink.click();
        BrowserUtils.sleep(2);
    }


    @Then("user sees below options under “product” dropdown")
    public void user_sees_below_options_under_product_dropdown(List<String> expectedOptions) {
        List<String> actualOptions = BrowserUtils.dropdownOptions_as_STRING(wtOrderPage.productDropdown);
        Assert.assertEquals(expectedOptions, actualOptions);
    }

    @Then("user sees Visa as enabled payment option")
    public void user_sees_visa_as_enabled_payment_option() {
        Assert.assertTrue(wtOrderPage.visaRadioButton.isEnabled());
    }

    @Then("user sees MasterCard as enabled payment option")
    public void user_sees_master_card_as_enabled_payment_option() {
        Assert.assertTrue(wtOrderPage.masterCardRadioButton.isEnabled());
    }

    @Then("user sees American Express as enabled payment option")
    public void user_sees_american_express_as_enabled_payment_option() {
        Assert.assertTrue(wtOrderPage.amexRadioButton.isEnabled());
    }

    @And("user enters quantity {string}")
    public void userEntersQuantity(String quantity) {
        wtOrderPage.quantity.clear();
        wtOrderPage.quantity.sendKeys(quantity);
    }

    @Then("user clicks to the calculate button")
    public void userClicksToTheCalculateButton() {
        wtOrderPage.calculateButton.click();
    }

    @And("user enters customer name {string}")
    public void userEntersCustomerName(String name) {
        wtOrderPage.inputName.sendKeys(name);
    }

    @And("user enters street {string}")
    public void userEntersStreet(String street) {
        wtOrderPage.inputStreet.sendKeys(street);
    }

    @And("user enters city {string}")
    public void userEntersCity(String city) {
        wtOrderPage.inputCity.sendKeys(city);
    }

    @And("user enters state {string}")
    public void userEntersState(String state) {
        wtOrderPage.inputState.sendKeys(state);
    }

    @And("user enters zip {string}")
    public void userEntersZip(String zipCode) {
        wtOrderPage.inputZip.sendKeys(zipCode);
    }

    @And("user selects payment option {string}")
    public void userSelectsPaymentOptionAmericanExpress(String expectedCardType)  {
        BrowserUtils.clickradioButton(wtOrderPage.cardType, expectedCardType);
    }

    @And("user enters credit card number {string}")
    public void userEntersCreditCardNumber(String CCNumber) {
        wtOrderPage.inputCreditCard.sendKeys(CCNumber);
    }

    @And("user enters expiration date {string}")
    public void userEntersExpirationDate(String expirationDate) {
        wtOrderPage.inputExpiration.sendKeys(expirationDate);
    }


    @And("user clicks to process order button")
    public void userClicksTo() {
        wtOrderPage.processOrderButton.click();

    }

    WT_ViewAllOrdersPage wtViewAllOrdersPage= new WT_ViewAllOrdersPage();

    @Then("user should see {string} in the first row of the web table")
    public void userShouldSeeInTheFirstRowOfTheWebTable(String expectedName) {
        String actualName = wtViewAllOrdersPage.newCustomerCell.getText();

        Assert.assertEquals(expectedName, actualName);


    }

}