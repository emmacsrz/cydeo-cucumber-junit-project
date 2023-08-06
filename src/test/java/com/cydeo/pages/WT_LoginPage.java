package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WT_LoginPage {

    public WT_LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//input[@class='input'])[1]")
    //or (name = "username")
    public WebElement usernameBox;

    @FindBy(xpath = "(//input[@class='input'])[2]")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[.='Login']")
    public WebElement loginButton;

    public void login(String user, String pass) {
        this.usernameBox.sendKeys("Test");
        this.passwordBox.sendKeys("Tester");
        this.loginButton.click();
    }

    /** this method will log in with credentials that are provided in the method at teh time of calling it
 */


}
