package webAppFunctions;

import PageObjects.*;


import Utilities.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class WebAppFunction extends BaseClass {

    WebDriver driver;

    public WebAppFunction(WebDriver remoteDriver)
    {
        driver = remoteDriver;
    }

    public void basicFunctionsTest() throws InterruptedException {

        BasicFunctionsObjects basicFunctionsObjects = new BasicFunctionsObjects(driver);
        basicFunctionsObjects.radioButton.click();
        basicFunctionsObjects.textBoxFill.click();
        basicFunctionsObjects.textBoxFill.sendKeys("USA");
        Thread.sleep(2000);

        basicFunctionsObjects.selectMenu.click();

        Select drpDate =  new Select(basicFunctionsObjects.dropDownSelect);
        drpDate.selectByVisibleText("Option3");

        basicFunctionsObjects.checkboxSelect1.click();
        basicFunctionsObjects.checkboxSelect2.click();

    }

    public void switchWindow() throws InterruptedException {
        SwitchWindowObjects switchWindowObject = new SwitchWindowObjects(driver);

        switchWindowObject.openWindow.click();

        Set<String> windows = driver.getWindowHandles();

        Iterator<String> that = windows.iterator();
        String parentWindowIndex = that.next();
        String childWindowIndex = that.next();

        driver.switchTo().window(childWindowIndex);
        Thread.sleep(5000);
        System.out.println(driver.switchTo().window(childWindowIndex).getTitle());

        }

    public void switchTab() throws InterruptedException {
        SwitchTabObjects switchTabObjects = new SwitchTabObjects(driver);

        switchTabObjects.openTab.click();

        Set<String> windows = driver.getWindowHandles();

        Iterator<String> that = windows.iterator();
        String parentWindowIndex = that.next();
        String childWindowIndex = that.next();

        driver.switchTo().window(childWindowIndex);
        Thread.sleep(5000);
        driver.switchTo().window(parentWindowIndex);

    }

    public void alertHandling() throws InterruptedException {
        AlertObjects alertObjects = new AlertObjects(driver);

        alertObjects.alertTextFill.click();
        alertObjects.alertTextFill.sendKeys("HELLO!!!!");

        alertObjects.alertButton.click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();

        Thread.sleep(2000);
        alertObjects.alertTextFill.click();
        alertObjects.alertTextFill.sendKeys("HELLO!!!!");

        alertObjects.confirmButton.click();
        Thread.sleep(2000);
        driver.switchTo().alert().dismiss();

    }

    public void listOfdata(){

        TableObjects tableObjects = new TableObjects(driver);

        System.out.println("Number Of Column Get::"+tableObjects.listData.size());

        //CALCULATE ALL AMOUNT OF PERTICULAR COLUMN OF AMOUNT AND TOTAL ALL VALUES
        int tempData = 0;
        for (WebElement col : tableObjects.listData)
        {
            String sumData = col.getText();
            int i = Integer.parseInt(sumData);
            tempData = tempData + i;
            System.out.println(col.getText());
        }

        System.out.println(tempData);

    }
}

