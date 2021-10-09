package SuncoastCreditUnion;

import extent.Reusable_Annotations_Class_Html_Report;
import org.kohsuke.rngom.parse.host.Base;
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
        BaseClass.branchLocatorPage().FillAddressField();
        BaseClass.branchLocatorPage().HitEnterOnAddressField();
        Thread.sleep(3000);
        BaseClass.branchLocatorPage().GetFirstResultFromBranchSearch();


    }

    @Test
    public static void CheckingAccountInfoTest() throws InterruptedException {
        BaseClass.basePage();
        Thread.sleep(2000);
        BaseClass.homePage().ClickOnBusinessTab();
        Thread.sleep(2000);
        BaseClass.businessPage().ClickOnBusinessBankingLink();
        Thread.sleep(2000);
        BaseClass.businessBankingPage().ClickOnBusinessCheckingAccountLink();
        Thread.sleep(2000);
        BaseClass.businessBankingCheckingAccountPage().ScrollToChartSection();
        Thread.sleep(200);
        BaseClass.businessBankingCheckingAccountPage().ClickOnTypeOfCheckingSelector();
        Thread.sleep(500);
        BaseClass.businessBankingCheckingAccountPage().SelectCheckingAccountType(2);
        BaseClass.businessBankingCheckingAccountPage().GetCheckAccountTypeInfo();
        Thread.sleep(1000);
        BaseClass.businessBankingCheckingAccountPage().ClickOnTypeOfCheckingSelector();
        Thread.sleep(500);
        BaseClass.businessBankingCheckingAccountPage().SelectCheckingAccountType(1);
        BaseClass.businessBankingCheckingAccountPage().GetCheckAccountTypeInfo();
        Thread.sleep(1000);
        BaseClass.businessBankingCheckingAccountPage().ClickOnTypeOfCheckingSelector();
        Thread.sleep(500);
        BaseClass.businessBankingCheckingAccountPage().SelectCheckingAccountType(0);
        BaseClass.businessBankingCheckingAccountPage().GetCheckAccountTypeInfo();
        Thread.sleep(2000);
    }

}
