package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EtsyPage {

    public EtsyPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//input[@id='global-enhancements-search-query']")
    public WebElement etsySearchBox;

    @FindBy (xpath = "(//button[@type='submit'])[1]")
    public WebElement etsySearchButton;
    //also: //button[@value='Search']
}
