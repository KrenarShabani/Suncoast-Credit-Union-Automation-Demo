package SuncoastCreditUnion.LoanPaymentCalculator;
import Day_7.ReusableMethods_With_Logger;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HomePage {

    @Test(groups ={"HomePage.Run"})
    public static void Run(WebDriver driver, ExtentTest logger) throws InterruptedException {
        Thread.sleep(1000);
        driver.navigate().to("https://www.suncoastcreditunion.com");
        WebElement BusinessPageTab = ReusableMethods_With_Logger.getWebElement(driver,"//*[text()='Business']",logger);
        ReusableMethods_With_Logger.click(driver,BusinessPageTab,"Clicking on Business Tab",logger);
        Thread.sleep(2000);
        return;
    }

}
