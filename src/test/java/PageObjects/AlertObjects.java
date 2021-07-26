package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertObjects {

    WebDriver webDriver;

    public AlertObjects(WebDriver webDriver)
    {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver,this);
    }

    @FindBy(xpath = "//input[@name='enter-name']")
    public WebElement alertTextFill;

    @FindBy(xpath = "//input[@id='alertbtn']")
    public WebElement alertButton;

    @FindBy(xpath = "//input[@id='confirmbtn']")
    public WebElement confirmButton;

}
