package TestCases;

import Utilities.BaseClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import webAppFunctions.WebAppFunction;

public class BasicFunctionsTestCase extends BaseClass {

        @Test
        public void basicFunctionsTestCase() throws InterruptedException {

            WebAppFunction webAppFunction = new WebAppFunction(webDriver);
            webAppFunction.basicFunctionsTest();
        }
}
