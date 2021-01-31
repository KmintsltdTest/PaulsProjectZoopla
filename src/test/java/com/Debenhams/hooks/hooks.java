package com.Debenhams.hooks;
import com.Debenhams.Common.BrowserClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class hooks extends BrowserClass
{
    private String Browser="Firefox";
    @Before//this means before any test run this action must be done first
    public void setUp()
    {   //This is called from Browser class(with all browser requirements already set) that already extends the DriversClass
        launchBrowser(Browser);
        System.out.println("-----------------Start of Scenario-----------------");
        System.out.println("Browser is Launched");
        System.out.println("Start the browser and Clear the cookies");
    }
    @After
    public void tearDown()//this actions must happen after the test run
    {
        System.out.println("-----------------End of Scenario-----------------");
        System.out.println("Test Execution Completed" +"\n");
        closeBrowser();
        quitBrowser();
    }
}