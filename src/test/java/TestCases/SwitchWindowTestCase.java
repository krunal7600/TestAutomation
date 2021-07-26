package TestCases;

import Utilities.BaseClass;
import org.testng.annotations.Test;
import webAppFunctions.WebAppFunction;

public class SwitchWindowTestCase extends BaseClass {

    @Test
    public void switchWindowTestCase() throws InterruptedException {

        WebAppFunction webAppFunction = new WebAppFunction(webDriver);
        webAppFunction.switchWindow();

    }
}
