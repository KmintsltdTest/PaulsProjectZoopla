package co.uk.Zoopla.StepsDefinition;
import co.uk.Zoopla.Common.BrowserClass;
import co.uk.Zoopla.Pages.basePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Zoopla extends basePage
{
    @Given("I am on Zoopla Homepage")
    public void i_am_on_zoopla_homepage()
    {
        LaunchURL(); // this is from basePage
    }
    @When("I enter  \"London\"in the search textbox")
    public void i_enter_london_in_the_search_textbox(String location)
    {
    }
    @When("I select \"£{double}\"from Min price dropdown")
    public void i_select_£_from_min_price_dropdown(Double minPrice)
    {

    }
    @When("I select \"£{double}\"from Max price dropdown")
    public void i_select_£_from_max_price_dropdown(Double maxPrice)
    {
    }
    @When("I select \"Houses\"from Property type dropdown")
    public void i_select_houses_from_property_type_dropdown(String property)
    {
    }
    @When("I select \"{int}+\"from Bedrooms dropdown")
    public void i_select_from_bedrooms_dropdown(Integer beds)
    {
    }
    @When("I click on Search button")
    public void i_click_on_search_button()
    {
    }
    @Then("a list of {string} in {string} are displayed")
    public void a_list_of_in_are_displayed(String property, String location)
    {
    }

}
