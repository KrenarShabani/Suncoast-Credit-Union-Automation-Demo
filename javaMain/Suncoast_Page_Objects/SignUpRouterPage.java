package SuncoastCreditUnion.javaMain.Suncoast_Page_Objects;

import SuncoastCreditUnion.javaMain.ReusableMethods_With_Logger;
import com.relevantcodes.extentreports.ExtentTest;
import SuncoastCreditUnion.javaMain.Reusable_Annotations_Class_Html_Report;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpRouterPage extends Reusable_Annotations_Class_Html_Report {
    public ExtentTest logger;
    public SignUpRouterPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
        this.logger = Reusable_Annotations_Class_Html_Report.logger;
    }
    @FindBy(xpath="//*[@class='btn btn-lg btn-continue btn-white business-membership']")
    private WebElement BusinessMembershipBtn;

    public void ClickOnBusinessMembershipBtn()
    {
        ReusableMethods_With_Logger.click(driver,BusinessMembershipBtn,"click on business membership button",logger);
    }
}
