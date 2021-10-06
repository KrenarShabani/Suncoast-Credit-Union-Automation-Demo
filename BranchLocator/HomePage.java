package SuncoastCreditUnion.BranchLocator;
import Day_7.ReusableMethods_With_Logger;
import SuncoastCreditUnion.BaseClass;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HomePage extends BaseClass {
    static WebElement BranchLocatorLink = null;
    public HomePage(WebDriver _driver, ExtentTest _logger)
    {
        super(_driver, _logger);
        WebElement BranchLocatorLink = ReusableMethods_With_Logger.getWebElement(driver,"/html/body/div[2]/header/div/div[3]/nav[1]/ul/li[4]/a",logger);

    }
    @Test
    public void Run() throws InterruptedException {
        Thread.sleep(1000);
        driver.navigate().to("https://www.suncoastcreditunion.com");
        Actions action = new Actions(driver);
        action.moveToElement(BranchLocatorLink).perform();
        Thread.sleep(500);


        ReusableMethods_With_Logger.click(driver,BranchLocatorLink,"Click on Branch Locator Link",logger);
        Thread.sleep(5000);
        return;
    }

}
