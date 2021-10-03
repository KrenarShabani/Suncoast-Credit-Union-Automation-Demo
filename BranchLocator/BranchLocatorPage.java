package SuncoastCreditUnion.BranchLocator;

import Day_7.ReusableMethods_With_Logger;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BranchLocatorPage {



    public static void Run(WebDriver driver, ExtentTest logger) throws InterruptedException {
        WebElement AddressField = ReusableMethods_With_Logger.getWebElement(driver,"//*[@class='inputAddress']",logger);
        ReusableMethods_With_Logger.sendKeys(driver,AddressField,"33614","input zipcode in text field",logger);
        AddressField.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        try {
            WebElement Location = ReusableMethods_With_Logger.getIndexedWebElement(driver, "//*[@class='location-info']",0, logger);
            logger.log(LogStatus.PASS, "Got address of nearest Branch: " + Location.getText());
        }catch (Exception e)
        {
            logger.log(LogStatus.FAIL, "Unable to get address of nearest Branch");


        }
    }
}