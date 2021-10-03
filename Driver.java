package SuncoastCreditUnion;

import SuncoastCreditUnion.LoanPaymentCalculator.*;
import extent.Reusable_Annotations_Class_Html_Report;
import org.testng.annotations.Test;

public class Driver extends Reusable_Annotations_Class_Html_Report {

    @Test
    public void LoanPaymentCalculatorTest() throws InterruptedException {
        HomePage.Run(driver,logger);
        BusinessPage.Run(driver,logger);
        LoanCalculatorPage.Run(driver,logger);
        LoanResultsPage.Run(driver,logger);
    }

    @Test
    public void BranchLocatorTest() throws InterruptedException
    {
        SuncoastCreditUnion.BranchLocator.HomePage.Run(driver,logger);
        SuncoastCreditUnion.BranchLocator.BranchLocatorPage.Run(driver,logger);
    }

}
