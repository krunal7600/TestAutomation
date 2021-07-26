package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasicFunctionsObjects {

    WebDriver webDriver;

    public BasicFunctionsObjects(WebDriver webDriver)
    {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver,this);
    }

    @FindBy(xpath = "//input[@name='radioButton']")
    public WebElement radioButton;

    @FindBy(xpath = "//input[@class='inputs ui-autocomplete-input']")
    public WebElement textBoxFill;

    @FindBy(xpath = "//div[@class='ui-menu-item-wrapper']")
    public WebElement selectMenu;

    @FindBy(xpath = "//select[@name='dropdown-class-example']")
    public WebElement dropDownSelect;

    @FindBy(xpath = "//input[@name='checkBoxOption1']")
    public WebElement checkboxSelect1;

    @FindBy(xpath = "//input[@name='checkBoxOption2']")
    public WebElement checkboxSelect2;

}
