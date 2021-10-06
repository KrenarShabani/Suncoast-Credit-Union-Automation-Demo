package SuncoastCreditUnion;

import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;

public class BaseClass {

    protected static WebDriver driver;
    protected static ExtentTest logger;

    public BaseClass(WebDriver _driver, ExtentTest _logger)
    {
        driver = _driver;
        logger = _logger;
    }


}
