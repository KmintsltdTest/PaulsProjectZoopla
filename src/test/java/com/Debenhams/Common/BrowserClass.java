package com.Debenhams.Common;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.IOException;


public class BrowserClass extends Drivers
{
    //These below browsers sets the types of browser that we might want to use to open webpage
    WebDriver driver;

    private WebDriver initChrome()
    {
        WebDriverManager.chromedriver().setup();
        //driver.manage().window().maximize();
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--start-maximized");
        driver.manage().deleteAllCookies();
        return new ChromeDriver(options);
    }
    private WebDriver initHeadlessChrome()
    {
        WebDriverManager.chromedriver().setup();
        ChromeOptions Options=new ChromeOptions();
        Options.addArguments("--start-maximized");
        Options.addArguments("--disable-gpu","--headless");//disable frontend and make browser headless
        driver.manage().deleteAllCookies();
        return new ChromeDriver(Options);
    }
    private WebDriver initHeadlessFirefox()
    {
        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions Options=new FirefoxOptions();
        Options.addArguments("--start-maximized");
        Options.addArguments("--disable-gpu","--headless");//disable frontend and make browser headless
        driver.manage().deleteAllCookies();
        return new FirefoxDriver(Options);
    }
    private WebDriver initFirefox()
    {
        WebDriverManager.firefoxdriver().setup();
        FirefoxOptions Options=new FirefoxOptions();
        Options.addArguments("--start-maximized");
        driver.manage().deleteAllCookies();
        return new FirefoxDriver(Options);
    }
    private WebDriver initInternetExplorer()//returns an instance of IE Driver
    {
        WebDriverManager.iedriver().setup();
        driver.manage().deleteAllCookies();
        return new InternetExplorerDriver();
    }
    //To call any type of browser from those declared above use the below method
    public void launchBrowser(String browser)
    {
        switch(browser)
        {
            case"chrome":
                driver=initChrome();
                break;
            case"HeadlessChrome":
                driver=initHeadlessChrome();
                break;
            case"Firefox":
                driver=initFirefox();
                break;
            case"HeadlessFirefox":
                driver=initHeadlessFirefox();
                break;
            case"InternetExplorer":
            case"ie":
            case"internetexplorer":
            case "IE":
            case "internet Explorer":
                driver=initInternetExplorer();
                break;
            default:
                driver=initHeadlessChrome();//if non of the above is present default this browser
        }
        driver.manage().window().maximize();//this maximises all choices i did this especially for IE since i didnt
        //use any options for IE
    }
    //This method closes the browser after deleting all the cookies
    public void closeBrowser()
    {
        driver.manage().deleteAllCookies();
        try
        {
            Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
      driver.close();

    }
    public void quitBrowser()
    {
        driver.quit();
    }
}

