package SuncoastCreditUnion.LoanPaymentCalculator;

import Day_7.ReusableMethods_With_Logger;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class BusinessPage{

    @Test(dependsOnGroups = {"HomePage.Run"})
    public static void Run(WebDriver driver, ExtentTest logger)throws InterruptedException
    {
        ReusableMethods_With_Logger.scroll(driver,0,500,logger);
        Thread.sleep(2000);
        WebElement LoanPaymentCalculatorLink = ReusableMethods_With_Logger.getWebElement(driver,"//*[@xmlns='http://www.w3.org/2000/svg']",logger);
        ReusableMethods_With_Logger.click(driver,LoanPaymentCalculatorLink,"clicking on loan payment calculator link", logger);
        Thread.sleep(2000);

    }



}
