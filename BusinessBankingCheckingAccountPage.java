package SuncoastCreditUnion;

import Day_7.ReusableMethods;
import Day_7.ReusableMethods_With_Logger;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import extent.Reusable_Annotations_Class_Html_Report;
import groovy.util.logging.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.logging.Logger;

public class BusinessBankingCheckingAccountPage extends Reusable_Annotations_Class_Html_Report {
    public ExtentTest logger;
    public BusinessBankingCheckingAccountPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
        this.logger = Reusable_Annotations_Class_Html_Report.logger;
    }

    @FindBy(xpath = "//*[@class='selectric']")
    private WebElement typeOfCheckingSelector;
    @FindBy(xpath = "//*[@class='selectric-scroll']")
    private WebElement checkingAccountSelector;
    @FindBy(xpath = "//*[@class='comparison-grid__product-info']")
    private List<WebElement> checkingAccInfo;

    public void ScrollToChartSection()
    {
        ReusableMethods_With_Logger.scroll(driver,0,1000,logger);
    }
    public void ClickOnTypeOfCheckingSelector()
    {
        ReusableMethods_With_Logger.click(driver,typeOfCheckingSelector,"click on type of checking selector",logger);
    }
    public void SelectCheckingAccountType(int index)
    {
        WebElement[] tabs = checkingAccountSelector.findElements(By.xpath("//*[@data-index]")).toArray(new WebElement[0]);
        ReusableMethods_With_Logger.click(driver,tabs[index],"click on checking account option", logger);
    }
    public void GetCheckAccountTypeInfo()
    {
        String text = "";
        try
        {
            for (WebElement elt : checkingAccInfo)
            {
                if(text != "")
                    text += " ";
                text += elt.getText();
            }
            logger.log(LogStatus.PASS,"got checking account info: " + text);
        }catch(Exception e)
        {
            logger.log(LogStatus.FAIL,"unable to get checking account info: " + e);
        }
    }
}
