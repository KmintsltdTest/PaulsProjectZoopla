package co.uk.Zoopla.hooks;
import co.uk.Zoopla.Common.BrowserClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class hooks extends BrowserClass
{
    private String chromeBrowser="chrome";

    @Before//this means before any test run this action must be done first
    public void setUp()
    {   //This is called from Browser class(with all browser requirements already set) that already extends the DriversClass
        launchBrowser(chromeBrowser);
        System.out.println("Browser is Launched");
    }
    @After//this actions must happen after the test run
    public void tearDown()
    {
        System.out.println("Test Execution Completed" +"\n");
        closeBrowser();
        quitBrowser();
    }
}