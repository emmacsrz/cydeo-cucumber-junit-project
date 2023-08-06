package com.cydeo.step_definitions;

import com.cydeo.pages.DropdownsPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DataTables_StepDefinitions {
    public DataTables_StepDefinitions(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @Then("user should see below list")
    public void user_should_see_below_list(List<String> fruitsAndVegetable) {
        System.out.println("fruitsAndVegetable = " + fruitsAndVegetable);
        System.out.println(fruitsAndVegetable.get(3));
    }

    @Then("I will share my favorites")
    public void iWillShareMyFavorites(List<String> listOfPets) {
        System.out.println(listOfPets);
    }

    @Then("officer is able to read any data he wants")
    public void officerIsAbleToReadAnyDataHeWants(Map<String, String> driverInfo) {
        System.out.println(driverInfo);
        System.out.println("driverInfo.get(\"name\") = " + driverInfo.get("name"));
        System.out.println("driverInfo.get(\"age\") = " + driverInfo.get("age"));
    }

    @Given("User is on the dropdowns page of practice tool")
    public void userIsOnTheDropdownsPageOfPracticeTool() {
    Driver.getDriver().get("https://practice.cydeo.com/dropdown");
    }
DropdownsPage dropdownsPage = new DropdownsPage();

    @Then("User should see below info in month dropdown")
    public void userShouldSeeBelowInfoInMonthDropdown(List<String> expectedMonths) {
        Select month = new Select(dropdownsPage.monthDropDown);

        List<WebElement> actualMonth_as_WEBELEMENT =  month.getOptions();

        List <String> actualMonth_as_STRING = new ArrayList<>();

        for (WebElement each:actualMonth_as_WEBELEMENT){
            actualMonth_as_STRING.add(each.getText());
        }
        Assert.assertEquals(expectedMonths, actualMonth_as_STRING);
    }

}
