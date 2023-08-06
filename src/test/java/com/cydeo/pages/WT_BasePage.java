package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WT_BasePage {
    //Only elements common to all pages on the web table page

    public WT_BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//button[.='View all orders']")
    public WebElement ViewAllOrdersLink;

    @FindBy (xpath = "//button[.='View all products']")
    public WebElement ViewAllProductsLink;

    @FindBy (xpath = "//button[.='Order']")
    //or:  //button[text()='Order']
    public WebElement orderPageLink;





}
