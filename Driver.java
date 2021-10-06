package SuncoastCreditUnion;

import extent.Reusable_Annotations_Class_Html_Report;
import org.testng.annotations.Test;

public class Driver extends Reusable_Annotations_Class_Html_Report {

    @Test
    public void LoanPaymentCalculatorTest() throws InterruptedException
    {
        BaseClass.basePage();
        Thread.sleep(2000);
        BaseClass.homePage().ClickOnBusinessTab();
        Thread.sleep(2000);
        BaseClass.businessPage().ScrollDown();
        Thread.sleep(300);
        BaseClass.businessPage().ClickOnLoanPaymentCalculatorLink();
        Thread.sleep(2000);
        BaseClass.loanCalculatorPage().EnterLoanAmount();
        BaseClass.loanCalculatorPage().EnterInterestRate();
        BaseClass.loanCalculatorPage().EnterTermMonths();
        BaseClass.loanCalculatorPage().SelectByDropDown();
        BaseClass.loanCalculatorPage().ClickOnCalculate();
        Thread.sleep(2000);
        BaseClass.loanResultsPage().ScrollToResult();
        Thread.sleep(200);
        BaseClass.loanResultsPage().GetScreenShotOfResult();

    }

    @Test
    public static void BranchLocatorTest() throws InterruptedException
    {
        BaseClass.basePage();
        Thread.sleep(2000);
        BaseClass.homePage().HoverBranchLocatorLink();
        Thread.sleep(500);
        BaseClass.homePage().ClickOnBranchLocatorLink();
        Thread.sleep(2000);
        BaseClass.branchLocatorPage().fillAddressField();
        BaseClass.branchLocatorPage().hitEnterOnAddressField();
        Thread.sleep(3000);
        BaseClass.branchLocatorPage().getFirstResultFromBranchSearch();


    }

}
