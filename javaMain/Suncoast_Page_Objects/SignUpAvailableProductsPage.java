package SuncoastCreditUnion.javaMain.Suncoast_Page_Objects;

import SuncoastCreditUnion.javaMain.ReusableMethods_With_Logger;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import SuncoastCreditUnion.javaMain.Reusable_Annotations_Class_Html_Report;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpAvailableProductsPage extends Reusable_Annotations_Class_Html_Report{
    public ExtentTest logger;
    public SignUpAvailableProductsPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
        this.logger = Reusable_Annotations_Class_Html_Report.logger;
    }

    @FindBy(xpath = "//*[@name='ctl00$ctl00$bodyContent$MainContent$ProductCategories$rptCategories$ctl00$ProductList$rptProducts$ctl00$ProductRow$btnSelectProduct']")
    private WebElement businessClassicCheckingBtn;
    @FindBy(xpath = "//select[@name='ctl00$MainContent$EditProduct$cqProductQuestions$rpt$ctl00$SingleCustomQuestion$drpAnswer']")
    private WebElement debitCardSelector;
    @FindBy(xpath = "//*[@name='ctl00$MainContent$EditProduct$cqProductQuestions$rpt$ctl01$SingleCustomQuestion$txtAnswer']")
    private WebElement businessNameTextBox;
    @FindBy(xpath = "//select[@name='ctl00$MainContent$EditProduct$cqProductQuestions$rpt$ctl02$SingleCustomQuestion$drpAnswer']")
    private WebElement overdraftProtectionSelector;
    @FindBy(xpath = "//input[@name='ctl00$Buttons$btnAdd']")
    private WebElement addCheckingAccountBtn;
    @FindBy(xpath = "//input[@name='ctl00$ctl00$bodyContent$MainContent$rptSideTabs$ctl01$lbSideTab']")
    private WebElement moneyMarketTab;
    @FindBy(xpath="//input[@name='ctl00$ctl00$bodyContent$MainContent$ProductCategories$rptCategories$ctl00$ProductList$rptProducts$ctl00$ProductRow$btnSelectProduct'")
    private WebElement businessMoneyMarketBtn;
    @FindBy(xpath = "//input[@name='ctl00$MainContent$EditProduct$AmountDeposit']")
    private WebElement moneyMarketDepositAmountTextBox;
    private final int mmdepositeMin = 1000;
    @FindBy(xpath="//input[@name='ctl00$ctl00$bodyContent$MainContent$rptSideTabs$ctl02$lbSideTab']")
    private WebElement savingsTab;
    @FindBy(xpath="//input[@name='ctl00$ctl00$bodyContent$MainContent$ProductCategories$rptCategories$ctl00$ProductList$rptProducts$ctl00$ProductRow$btnSelectProduct']")
    private WebElement businessSpecialSavingsBtn;
    @FindBy(xpath="//input[@name='ctl00$ctl00$bodyContent$Buttons$nav$btnNext']")
    private WebElement continueBtn;
    public void ClickOnBusinessClassicChecking() {
        ReusableMethods_With_Logger.click(driver,businessClassicCheckingBtn,"click on business classic checking",logger);
    }
    // "Yes" or "No" only
    public void SelectDebitCardOption(String answer) {
        ReusableMethods_With_Logger.selectDropdownByValue(driver,debitCardSelector,answer,"selecting \""+answer+"\" for \"do you want a debit card?\"",logger);
    }
    public void EnterBusinessNameForDebitCard(String name) {
        ReusableMethods_With_Logger.sendKeys(driver,businessNameTextBox,name,"entering \""+name+"\" for debit card name textbox",logger);
    }
    public void SelectOverdraftProtection(String answer) {
        ReusableMethods_With_Logger.selectDropdownByValue(driver,overdraftProtectionSelector,answer,"selecting \""+answer+"\" for \"do you want a overdraft protection?\"",logger);
    }
    public void ClickOnAddAccountChecking() {
        ReusableMethods_With_Logger.click(driver,addCheckingAccountBtn,"click on add account",logger);
    }
    public void ClickOnMoneyMarketTab() {
        ReusableMethods_With_Logger.click(driver,moneyMarketTab,"click on business money market tab",logger);
    }
    public void ClickOnBusinessMoneyMarketBtn() {
        ReusableMethods_With_Logger.click(driver,businessMoneyMarketBtn,"click on business money market product",logger);
    }
    public void EnterMoneyMarketDepositAmount(int amount){
        if(amount < mmdepositeMin){logger.log(LogStatus.FAIL,"user entered amount less than the minimum ("+mmdepositeMin+")");
        driver.quit();}
        ReusableMethods_With_Logger.sendKeys(driver,moneyMarketDepositAmountTextBox,Integer.toString(amount),"enter \"" + amount + "\" for money market deposite amount",logger);
    }
    public void ClickOnSavingsTab()
    {
        ReusableMethods_With_Logger.click(driver,savingsTab,"click on savings tab",logger);
    }
    public void ClickOnBusinessSpecialSavingsBtn()
    {
        ReusableMethods_With_Logger.click(driver,businessSpecialSavingsBtn,"click on business special savings", logger);
    }
    public void ClickOnContinueBtn()
    {
        ReusableMethods_With_Logger.click(driver,continueBtn,"click on continue",logger);
    }



}
