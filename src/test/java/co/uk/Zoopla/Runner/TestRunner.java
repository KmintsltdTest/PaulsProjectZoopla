package co.uk.Zoopla.Runner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/java/co/uk/Zoopla/Features"}
        ,plugin = {"pretty","json:target/report.json","de.monochromata.cucumber.report.PrettyReports:target/pretty-cucumber"}
        ,glue={"co/uk/Zoopla/StepsDefinitions"}
        ,tags ={~@ignored})

//By Running the TestRunner stepsDefinition will automatically be generated
public class TestRunner
{

}