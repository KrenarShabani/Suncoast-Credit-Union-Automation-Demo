package SuncoastCreditUnion.javaMain.Suncoast_Page_Objects;

import SuncoastCreditUnion.javaMain.ReusableMethods_With_Logger;
import com.relevantcodes.extentreports.ExtentTest;
import SuncoastCreditUnion.javaMain.Reusable_Annotations_Class_Html_Report;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BusinessPage extends Reusable_Annotations_Class_Html_Report {
    public ExtentTest logger;
    public BusinessPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
        this.logger = Reusable_Annotations_Class_Html_Report.logger;
    }

    @FindBy(xpath = "//a[@href='/resources/calculators/loan-payment-calculator']")
    private WebElement LoanPaymentCalculatorLink;

    @FindBy(xpath = "//*[(@href='/business/bank') and (@class='btn btn-block btn-go')]")
    private WebElement BusinessBankingLink;


    public void ScrollDown()
    {
        ReusableMethods_With_Logger.scroll(driver,0,500,logger);
    }
    public void ClickOnLoanPaymentCalculatorLink()
    {
        ReusableMethods_With_Logger.click(driver,LoanPaymentCalculatorLink,"click on loan payment calculator link", logger);
    }
    public void ClickOnBusinessBankingLink()
    {
        ReusableMethods_With_Logger.click(driver,BusinessBankingLink,"click on business banking link", logger);
    }



}
