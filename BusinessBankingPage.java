package SuncoastCreditUnion;

import Day_7.ReusableMethods_With_Logger;
import com.relevantcodes.extentreports.ExtentTest;
import extent.Reusable_Annotations_Class_Html_Report;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BusinessBankingPage extends Reusable_Annotations_Class_Html_Report {
    public ExtentTest logger;
    public BusinessBankingPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
        this.logger = Reusable_Annotations_Class_Html_Report.logger;
    }
    @FindBy(xpath = "//*[(@href='/business/bank/checking-account') and (@class='btn btn-block btn-go')]")
    private WebElement businessCheckingAccountLink;

    public void ClickOnBusinessCheckingAccountLink()
    {
        ReusableMethods_With_Logger.click(driver,businessCheckingAccountLink,"click on business checking account link",logger);
    }
}
