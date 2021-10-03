package SuncoastCreditUnion.LoanPaymentCalculator;

import Day_7.ReusableMethods_With_Logger;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LoanResultsPage {

    @Test
    public static void Run(WebDriver driver, ExtentTest logger) throws InterruptedException {
        ReusableMethods_With_Logger.scroll(driver,0,1000,logger);
        ReusableMethods_With_Logger.getScreenShot(driver,"InterestRates",logger);
        Thread.sleep(5000);

    }



}
