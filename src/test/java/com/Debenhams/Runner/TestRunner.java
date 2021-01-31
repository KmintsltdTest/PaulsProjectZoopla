package com.Debenhams.Runner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/java/com/Debenhams/Features"}
        ,plugin = {"pretty","json:target/report.json","de.monochromata.cucumber.report.PrettyReports:target/pretty-cucumber"}
        ,glue={"src/test/java/com/Debenhams/StepsDefinition","com/Debenhams/hooks"}
         )
//By Running the TestRunner stepsDefinition will automatically be generated
public class TestRunner
{
}
