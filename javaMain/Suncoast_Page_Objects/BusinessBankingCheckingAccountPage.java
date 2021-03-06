package SuncoastCreditUnion.javaMain.Suncoast_Page_Objects;

import SuncoastCreditUnion.javaMain.ReusableMethods_With_Logger;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import SuncoastCreditUnion.javaMain.Reusable_Annotations_Class_Html_Report;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

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
    public void GetCheckingAccountTypeInfo()
    {
        StringBuilder text = new StringBuilder();
        try
        {
            for (WebElement elt : checkingAccInfo)
            {
                if(!text.toString().equals(""))
                    text.append(" ");
                text.append(elt.getText());
            }
            driver.switchTo();
            logger.log(LogStatus.PASS,"got checking account info: " + text);
        }catch(Exception e)
        {
            logger.log(LogStatus.FAIL,"unable to get checking account info: " + e);
        }
    }


}
