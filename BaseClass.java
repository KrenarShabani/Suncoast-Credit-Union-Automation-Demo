package SuncoastCreditUnion;
import extent.Reusable_Annotations_Class_Html_Report;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BaseClass extends Reusable_Annotations_Class_Html_Report {

    public BaseClass(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }
    public static void basePage() {
        driver.navigate().to("https://www.suncoastcreditunion.com");
    }
    public static HomePage homePage()
    {
        HomePage homePage = new HomePage(driver);
        return homePage;
    }

    public static BranchLocatorPage branchLocatorPage()
    {
        BranchLocatorPage branchLocatorPage = new BranchLocatorPage(driver);
        return branchLocatorPage;
    }

    public static BusinessPage businessPage()
    {
        BusinessPage businessPage = new BusinessPage(driver);
        return businessPage;
    }
    public static LoanCalculatorPage loanCalculatorPage()
    {
        LoanCalculatorPage loanCalculatorPage = new LoanCalculatorPage(driver);
        return loanCalculatorPage;
    }
    public static LoanResultsPage loanResultsPage()
    {
        LoanResultsPage loanResultsPage = new LoanResultsPage(driver);
        return loanResultsPage;
    }
    public static BusinessBankingPage businessBankingPage()
    {
        BusinessBankingPage businessBankingPage = new BusinessBankingPage(driver);
        return businessBankingPage;
    }
    public static BusinessBankingCheckingAccountPage businessBankingCheckingAccountPage()
    {
        BusinessBankingCheckingAccountPage businessBankingCheckingAccountPage = new BusinessBankingCheckingAccountPage(driver);
        return businessBankingCheckingAccountPage;
    }


}
