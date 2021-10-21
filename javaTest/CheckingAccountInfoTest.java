package SuncoastCreditUnion.javaTest;
import SuncoastCreditUnion.javaMain.Reusable_Annotations_Class_Html_Report;
import SuncoastCreditUnion.javaMain.Suncoast_Page_Objects.BaseClass;
import org.testng.annotations.Test;

public class CheckingAccountInfoTest extends Reusable_Annotations_Class_Html_Report {
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
        BaseClass.businessBankingCheckingAccountPage().GetCheckingAccountTypeInfo();
        Thread.sleep(1000);
        BaseClass.businessBankingCheckingAccountPage().ClickOnTypeOfCheckingSelector();
        Thread.sleep(500);
        BaseClass.businessBankingCheckingAccountPage().SelectCheckingAccountType(1);
        BaseClass.businessBankingCheckingAccountPage().GetCheckingAccountTypeInfo();
        Thread.sleep(1000);
        BaseClass.businessBankingCheckingAccountPage().ClickOnTypeOfCheckingSelector();
        Thread.sleep(500);
        BaseClass.businessBankingCheckingAccountPage().SelectCheckingAccountType(0);
        BaseClass.businessBankingCheckingAccountPage().GetCheckingAccountTypeInfo();
        Thread.sleep(2000);
    }
}
