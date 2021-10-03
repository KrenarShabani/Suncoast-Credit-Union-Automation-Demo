package SuncoastCreditUnion.BranchLocator;
import Day_7.ReusableMethods_With_Logger;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HomePage {

    @Test
    public static void Run(WebDriver driver, ExtentTest logger) throws InterruptedException {
        Thread.sleep(1000);
        driver.navigate().to("https://www.suncoastcreditunion.com");
        WebElement BranchLocatorLink = ReusableMethods_With_Logger.getWebElement(driver,"/html/body/div[2]/header/div/div[3]/nav[1]/ul/li[4]/a",logger);
        Actions action = new Actions(driver);
        action.moveToElement(BranchLocatorLink).perform();
        Thread.sleep(500);


        ReusableMethods_With_Logger.click(driver,BranchLocatorLink,"Click on Branch Locator Link",logger);
        Thread.sleep(5000);
        return;
    }

}
