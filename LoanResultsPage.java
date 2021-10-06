package SuncoastCreditUnion;

import Day_7.ReusableMethods_With_Logger;
import com.relevantcodes.extentreports.ExtentTest;
import extent.Reusable_Annotations_Class_Html_Report;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoanResultsPage extends Reusable_Annotations_Class_Html_Report {
    public ExtentTest logger;
    public LoanResultsPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
        this.logger = Reusable_Annotations_Class_Html_Report.logger;
    }

    public void ScrollToResult()
    {
        ReusableMethods_With_Logger.scroll(driver,0,1000,logger);
    }
    public void GetScreenShotOfResult() throws InterruptedException {
        ReusableMethods_With_Logger.getScreenShot(driver,"InterestRates",logger);
    }



}
