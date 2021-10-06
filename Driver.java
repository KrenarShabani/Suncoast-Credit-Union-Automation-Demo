package SuncoastCreditUnion;

import SuncoastCreditUnion.BranchLocator.*;
import SuncoastCreditUnion.LoanPaymentCalculator.*;
import extent.Reusable_Annotations_Class_Html_Report;
import org.testng.annotations.Test;

public class Driver extends Reusable_Annotations_Class_Html_Report {

    @Test
    public void LoanPaymentCalculatorTest() throws InterruptedException {
        SuncoastCreditUnion.LoanPaymentCalculator.HomePage homePage = new SuncoastCreditUnion.LoanPaymentCalculator.HomePage(driver, logger);
        BusinessPage businessPage = new BusinessPage(driver, logger);
        LoanCalculatorPage loanCalculatorPage = new LoanCalculatorPage(driver,logger);
        LoanResultsPage loanResultsPage = new LoanResultsPage(driver,logger);

        homePage.Run();
        businessPage.Run();
        loanCalculatorPage.Run();
        loanResultsPage.Run();
    }

    @Test
    public void BranchLocatorTest() throws InterruptedException
    {
        SuncoastCreditUnion.BranchLocator.HomePage homePage = new SuncoastCreditUnion.BranchLocator.HomePage(driver,logger);
        BranchLocatorPage branchLocatorPage = new BranchLocatorPage(driver,logger);
        homePage.Run();
        branchLocatorPage.Run();

    }

}
