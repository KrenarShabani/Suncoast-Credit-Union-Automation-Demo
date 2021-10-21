package SuncoastCreditUnion.javaMain.Suncoast_Page_Objects;

import SuncoastCreditUnion.javaMain.ReusableMethods_With_Logger;
import com.relevantcodes.extentreports.ExtentTest;
import SuncoastCreditUnion.javaMain.Reusable_Annotations_Class_Html_Report;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoanCalculatorPage extends Reusable_Annotations_Class_Html_Report {

    public ExtentTest logger;
    public LoanCalculatorPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
        this.logger = Reusable_Annotations_Class_Html_Report.logger;
    }
    @FindBy(xpath = "//*[@id='loanAmount']")
    private WebElement loanAmount;
    @FindBy(xpath="//*[@id='interestRate']")
    private WebElement interestRate;
    @FindBy(xpath="//*[@id='termMonths']")
    private WebElement termMonths;
    @FindBy(xpath="//*[@id='amortization']")
    private WebElement amortization;
    @FindBy(xpath="//*[@class='calculate btn2 nextBtn tabCalculate']")
    private WebElement calculateBtn;

    public void EnterLoanAmount()
    {
        loanAmount.clear();
        ReusableMethods_With_Logger.sendKeys(driver,loanAmount,"10000","entering 10000 for loan amount",logger);
    }
    public void EnterInterestRate()
    {
        interestRate.clear();
        ReusableMethods_With_Logger.sendKeys(driver,interestRate,"12","entering 12 for loan interest rate",logger);
    }
    public void EnterTermMonths()
    {
        ReusableMethods_With_Logger.sendKeys(driver,termMonths,"36","entering 36 for term of loan in months",logger);
    }
    public void SelectByDropDown()
    {
        ReusableMethods_With_Logger.selectDropdownByIndex(driver,amortization,"1","selecting yearly for table display",logger);
    }
    public void ClickOnCalculate()
    {
        ReusableMethods_With_Logger.click(driver, calculateBtn,"click on calculate button",logger);
    }


}
