package com.cydeo.step_definitions;
//we will be able to create pre and post condition for all of the scenarios and even steps


import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    //import the before coming from io.cucumber.java

    @Before //(value = "@login", order = 2)
    public void setupMethod() {
        System.out.println("----@Before: RUNS BEFORE EACH SCENARIO");
    }

    @After
    public void tearDownMethod(Scenario scenario) {

        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
        
            System.out.println("---@After: RUNNING AFTER EACH SCENARIO");

        BrowserUtils.sleep(2);
            Driver.closeDriver();



    }
//
//    @BeforeStep
//    public void setupStep() {
//        System.out.println("---->@BeforeStep: running before each step!");
//    }
//
//
//    @AfterStep
//    public void teardownstep() {
//        System.out.println("---->@afterstep: running before each step!");
//    }

}
