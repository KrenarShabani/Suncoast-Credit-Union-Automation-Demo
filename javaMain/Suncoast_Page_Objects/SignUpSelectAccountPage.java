package SuncoastCreditUnion.javaMain.Suncoast_Page_Objects;

import SuncoastCreditUnion.javaMain.ReusableMethods_With_Logger;
import com.relevantcodes.extentreports.ExtentTest;
import SuncoastCreditUnion.javaMain.Reusable_Annotations_Class_Html_Report;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpSelectAccountPage extends Reusable_Annotations_Class_Html_Report {
    public ExtentTest logger;
    public SignUpSelectAccountPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
        this.logger = Reusable_Annotations_Class_Html_Report.logger;
    }
    @FindBy(xpath ="//*[@name='ctl00$ctl00$bodyContent$MainContent$ProductPools$rptProductPools$ctrl0$editProduct$btnSelect']")
    private WebElement selectRegularSavingsBtn;
    @FindBy(xpath ="//*[@name='ctl00$ctl00$bodyContent$Buttons$nav$btnNext']")
    private WebElement continueBtn;

    public void ClickOnRegularSavingsBtn()
    {
        ReusableMethods_With_Logger.click(driver,selectRegularSavingsBtn,"select regular savings",logger);
    }
    public void ClickOnContinue()
    {
        ReusableMethods_With_Logger.click(driver,continueBtn,"click on continue",logger);
    }


}
