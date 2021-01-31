package com.Debenhams.Pages;
import com.Debenhams.Common.Drivers;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class basePage extends Drivers
{
    // this opens the URL using the associated Browser
    public String BASE_URL="https://www.debenhams.com/";
    public Select select ; // we use this select to select webpages(elements) further down
    public void LaunchURL()
    {
        driver.navigate().to(BASE_URL);
    }
    //there are various ways to select elements as shown below
    //selecting webelement by using VisibleText
    public void selectElementByVisibleText(WebElement element, String text)
    {
        select =new Select(element);
        select.selectByVisibleText(text);
    }
    //selecting webelement by using VisibleText
    public void selectElementByVisibleValue(WebElement element, String Value)
    {
        select =new Select(element);
        select.selectByVisibleText(Value);
    }
    //selecting webelement by using VisibleIndex
    public void selectElementByVisibleIndex(WebElement element, String Index)
    {
        select =new Select(element);
        select.selectByVisibleText(Index);
    }
}
