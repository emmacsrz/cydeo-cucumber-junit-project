package com.cydeo.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {
        "pretty",
        //pretty plugin prints out more information about scenarios and execution
        // on the console
        "html:target/cucumber-reports.html",
        //create html report :  and put it in the target file/file name
        "rerun:target/rerun.txt",
        //type of plugin : where to put information
        "me.jvt.cucumber.report.PrettyReports:target/cucumber"
},
        features = "src/test/resources/features",
        glue = "com/cydeo/step_definitions",
        dryRun = false,
        tags = "@wip",
        publish = true
       // ,monochrome = true //monochrome works with pretty plugin, changes colors of what is printed on console
)


public class CukesRunner {

}