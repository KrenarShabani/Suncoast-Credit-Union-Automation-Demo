package SuncoastCreditUnion.LoanPaymentCalculator;

import Day_7.ReusableMethods_With_Logger;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoanCalculatorPage {
    @Test
    public static void Run(WebDriver driver, ExtentTest logger) throws InterruptedException {
        WebElement loanAmount = ReusableMethods_With_Logger.getWebElement(driver,"//*[@id='loanAmount']",logger);
        WebElement interestRate = ReusableMethods_With_Logger.getWebElement(driver,"//*[@id='interestRate']",logger);
        WebElement termMonths = ReusableMethods_With_Logger.getWebElement(driver,"//*[@id='termMonths']",logger);
        WebElement amortization = ReusableMethods_With_Logger.getWebElement(driver,"//*[@id='amortization']",logger);
        WebElement calculateBtn = ReusableMethods_With_Logger.getWebElement(driver,"//*[@class='calculate btn2 nextBtn tabCalculate']",logger);

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
