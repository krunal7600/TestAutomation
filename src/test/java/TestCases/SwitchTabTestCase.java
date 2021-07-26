package TestCases;

import Utilities.BaseClass;
import org.testng.annotations.Test;
import webAppFunctions.WebAppFunction;

public class SwitchTabTestCase extends BaseClass {

    @Test
    public void switchTabTestCase() throws InterruptedException {

        WebAppFunction webAppFunction = new WebAppFunction(webDriver);
        webAppFunction.switchTab();
    }

}
