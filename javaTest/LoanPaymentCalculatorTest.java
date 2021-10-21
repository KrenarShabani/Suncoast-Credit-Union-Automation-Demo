package SuncoastCreditUnion.javaTest;

import SuncoastCreditUnion.javaMain.Suncoast_Page_Objects.BaseClass;
import SuncoastCreditUnion.javaMain.Reusable_Annotations_Class_Html_Report;
import org.testng.annotations.Test;


public class LoanPaymentCalculatorTest extends Reusable_Annotations_Class_Html_Report{

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
}

