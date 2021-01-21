package co.uk.Zoopla.StepsDefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class ForSaleSearchSteps
{
        WebDriver driver;
        @Given("I am on Zoopla Homepage")
        public void i_am_on_zoopla_homepage()
        {       String URL="https://www.zoopla.co.uk";
                //Using selenium code below to performs the operations in the stepdefinitions
                //Import WebDriver driver; this invites the selenium code into the step definition
                //setup the webdriver driver to Chrome or browser of choice.
                WebDriver driver;//an object of selenium is created (driver).
                //instantiate the driver and set it up to use chrome driver.
                //the selenium WebDriver is in the WebDriver Manager
                WebDriverManager.chromedriver().setup();
                //driver.manage().window().maximize(); for IE and FireFox
                ChromeOptions ChromeOptions = new ChromeOptions();
                ChromeOptions.addArguments("--start-maximized");
                driver= new ChromeDriver(ChromeOptions);
                driver.navigate().to(URL);
                driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
                WebElement AcceptAllCookies= driver.findElement(By.cssSelector("#cookie-consent-form > div > div > div > button.ui-button-primary.ui-cookie-accept-all-medium-large"));
                AcceptAllCookies.click();
        }
        @When("I enter  \"London\"in the search textbox")
        public void i_enter_london_in_the_search_textbox()
        {
        }
        @When("I select \"£{double}\"from Min price dropdown")
        public void i_select_£_from_min_price_dropdown(Double double1)
        {
        }
        @When("I select \"£{double}\"from Max price dropdown")
        public void i_select_£_from_max_price_dropdown(Double double1)
        {
        }
        @When("I select \"Houses\"from Property type dropdown")
        public void i_select_houses_from_property_type_dropdown()
        {
        }
        @When("I select \"{int}+\"from Bedrooms dropdown")
        public void i_select_from_bedrooms_dropdown(Integer int1)
        {
        }
        @When("I click on Search button")
        public void i_click_on_search_button()
        {
        }
        @Then("a list of {string} in {string} are displayed")
        public void a_list_of_in_are_displayed(String string, String string2)
        {
        }
        @Then("application should be closed.")
        public void application_should_be_closed()
        {
        }

}