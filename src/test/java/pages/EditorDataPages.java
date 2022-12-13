package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.html.HTMLInputElement;
import utilities.Driver;

public class EditorDataPages {

    public EditorDataPages(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//button[@class='dt-button buttons-create']")
    public WebElement newButton;

    @FindBy (id = "DTE_Field_first_name")
    public WebElement firstname;
    @FindBy (id = "DTE_Field_last_name")
    public WebElement lastname;
    @FindBy (id = "DTE_Field_position")
    public WebElement position;
    @FindBy (id = "DTE_Field_office")
    public WebElement office;
    @FindBy (id = "DTE_Field_extn")
    public WebElement extension;
    @FindBy (id = "DTE_Field_start_date")
    public WebElement start;
    @FindBy (id = "DTE_Field_salary")
    public WebElement salary;

    @FindBy (className = "btn")
    public WebElement createButton;

    @FindBy (xpath = "//input[@type='search']")
    public WebElement searchBox;

    @FindBy (css = "[class=\"sorting_1\"]")
    public WebElement result;
}
