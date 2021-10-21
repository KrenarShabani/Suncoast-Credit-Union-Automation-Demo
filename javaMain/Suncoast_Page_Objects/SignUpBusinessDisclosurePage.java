package SuncoastCreditUnion.javaMain.Suncoast_Page_Objects;

import SuncoastCreditUnion.javaMain.ReusableMethods_With_Logger;
import com.relevantcodes.extentreports.ExtentTest;
import SuncoastCreditUnion.javaMain.Reusable_Annotations_Class_Html_Report;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpBusinessDisclosurePage extends Reusable_Annotations_Class_Html_Report{
    public ExtentTest logger;
    public SignUpBusinessDisclosurePage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
        this.logger = Reusable_Annotations_Class_Html_Report.logger;
    }

    @FindBy(xpath = "//*[@name='lpqconfirm_PrivacyPolicyandMemAcctAgreemt']")
    private WebElement privacyPolicyCheckbox;
    @FindBy(xpath = "//*[@name='lpqconfirm_EConsent']")
    private WebElement econsentCheckbox;
    @FindBy(xpath="//*[@name='ctl00$ctl00$bodyContent$Buttons$nav$btnNext']")
    private WebElement privacyPolicyandEconsentContinueBtn;

    public void ClickOnPrivacyPolicyCheckBox()
    {
        ReusableMethods_With_Logger.click(driver,privacyPolicyCheckbox,"tick privacy policy checkbox",logger);
    }
    public void ClickOnEConsentCheckBox()
    {
        ReusableMethods_With_Logger.click(driver,econsentCheckbox,"tick privacy policy checkbox",logger);
    }
    public void ClickOnConsentContinueBtn()
    {
        ReusableMethods_With_Logger.click(driver,privacyPolicyandEconsentContinueBtn,"click on continue after consent",logger);
    }
}

