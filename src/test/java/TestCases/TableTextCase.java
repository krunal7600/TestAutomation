package TestCases;

import Utilities.BaseClass;
import org.testng.annotations.Test;
import webAppFunctions.WebAppFunction;

public class TableTextCase extends BaseClass {

    @Test
    public void tableTaseCase(){

        WebAppFunction webAppFunction = new WebAppFunction(webDriver);
        webAppFunction.listOfdata();
    }
}
