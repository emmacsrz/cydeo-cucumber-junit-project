package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPage {
    //create constructor and initalize driver with object
    public GoogleSearchPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //use findby instead of findelement

    @FindBy (name = "q")
    public WebElement searchBox;


}
