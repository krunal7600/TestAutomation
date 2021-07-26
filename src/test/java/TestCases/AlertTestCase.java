package TestCases;

import Utilities.BaseClass;
import org.testng.annotations.Test;
import webAppFunctions.WebAppFunction;

public class AlertTestCase extends BaseClass {

    @Test
    public void alertTestCase() throws InterruptedException {

        WebAppFunction webAppFunction = new WebAppFunction(webDriver);
        webAppFunction.alertHandling();

        
    }
}
