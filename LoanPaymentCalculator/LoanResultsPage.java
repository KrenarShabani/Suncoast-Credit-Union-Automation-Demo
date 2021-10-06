package SuncoastCreditUnion.LoanPaymentCalculator;

import Day_7.ReusableMethods_With_Logger;
import SuncoastCreditUnion.BaseClass;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LoanResultsPage extends BaseClass {
    public LoanResultsPage(WebDriver _driver, ExtentTest _logger)
    {
        super(_driver,_logger);
    }
    @Test
    public void Run() throws InterruptedException {
        ReusableMethods_With_Logger.scroll(driver,0,1000,logger);
        ReusableMethods_With_Logger.getScreenShot(driver,"InterestRates",logger);
        Thread.sleep(5000);

    }



}
