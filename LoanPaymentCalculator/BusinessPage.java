package SuncoastCreditUnion.LoanPaymentCalculator;

import Day_7.ReusableMethods_With_Logger;
import SuncoastCreditUnion.BaseClass;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class BusinessPage extends BaseClass {
    static WebElement LoanPaymentCalculatorLink = null;
    public BusinessPage(WebDriver _driver, ExtentTest _logger)
    {
        super(_driver,_logger);
        LoanPaymentCalculatorLink = ReusableMethods_With_Logger.getWebElement(driver,"//*[@xmlns='http://www.w3.org/2000/svg']",logger);

    }
    @Test(dependsOnGroups = {"HomePage.Run"})
    public void Run()throws InterruptedException
    {
        ReusableMethods_With_Logger.scroll(driver,0,500,logger);
        Thread.sleep(2000);
        ReusableMethods_With_Logger.click(driver,LoanPaymentCalculatorLink,"clicking on loan payment calculator link", logger);
        Thread.sleep(2000);

    }



}
