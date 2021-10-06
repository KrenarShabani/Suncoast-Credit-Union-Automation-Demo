package SuncoastCreditUnion.LoanPaymentCalculator;
import Day_7.ReusableMethods_With_Logger;
import SuncoastCreditUnion.BaseClass;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HomePage extends BaseClass {
    static WebElement BusinessPageTab = null;
    public HomePage(WebDriver _driver, ExtentTest _logger)
    {
        super(_driver,_logger);
        BusinessPageTab = ReusableMethods_With_Logger.getWebElement(driver,"//*[text()='Business']",logger);
    }

    @Test(groups ={"HomePage.Run"})
    public void Run() throws InterruptedException {
        Thread.sleep(1000);
        driver.navigate().to("https://www.suncoastcreditunion.com");
        ReusableMethods_With_Logger.click(driver,BusinessPageTab,"Clicking on Business Tab",logger);
        Thread.sleep(2000);
        return;
    }

}
