package SuncoastCreditUnion.LoanPaymentCalculator;

import Day_7.ReusableMethods_With_Logger;
import SuncoastCreditUnion.BaseClass;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoanCalculatorPage extends BaseClass {

    static WebElement loanAmount = null;
    static WebElement interestRate = null;
    static WebElement termMonths = null;
    static WebElement amortization = null;
    static WebElement calculateBtn = null;
    public LoanCalculatorPage(WebDriver _driver, ExtentTest _logger)
    {
        super(_driver,_logger);
        loanAmount = ReusableMethods_With_Logger.getWebElement(driver,"//*[@id='loanAmount']",logger);
        interestRate = ReusableMethods_With_Logger.getWebElement(driver,"//*[@id='interestRate']",logger);
        termMonths = ReusableMethods_With_Logger.getWebElement(driver,"//*[@id='termMonths']",logger);
        amortization = ReusableMethods_With_Logger.getWebElement(driver,"//*[@id='amortization']",logger);
        calculateBtn = ReusableMethods_With_Logger.getWebElement(driver,"//*[@class='calculate btn2 nextBtn tabCalculate']",logger);
    }


    @Test
    public void Run() throws InterruptedException {
        loanAmount = ReusableMethods_With_Logger.getWebElement(driver,"//*[@id='loanAmount']",logger);
        interestRate = ReusableMethods_With_Logger.getWebElement(driver,"//*[@id='interestRate']",logger);
        termMonths = ReusableMethods_With_Logger.getWebElement(driver,"//*[@id='termMonths']",logger);
        amortization = ReusableMethods_With_Logger.getWebElement(driver,"//*[@id='amortization']",logger);
        calculateBtn = ReusableMethods_With_Logger.getWebElement(driver,"//*[@class='calculate btn2 nextBtn tabCalculate']",logger);

        loanAmount.clear();
        interestRate.clear();
       // amortization.clear();

        ReusableMethods_With_Logger.sendKeys(driver,loanAmount,"10000","entering 10000 for loan amount",logger);
        ReusableMethods_With_Logger.sendKeys(driver,interestRate,"12","entering 12 for loan interest rate",logger);
        ReusableMethods_With_Logger.sendKeys(driver,termMonths,"36","entering 36 for term of loan in months",logger);
        ReusableMethods_With_Logger.selectDropdownByIndex(driver,amortization,"1","selecting yearly for table display",logger);
        ReusableMethods_With_Logger.click(driver, calculateBtn,"click on calculate button",logger);
        Thread.sleep(3000);
        return;


    }


}
