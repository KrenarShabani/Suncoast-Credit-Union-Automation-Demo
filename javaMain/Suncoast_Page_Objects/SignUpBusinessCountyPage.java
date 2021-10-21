package SuncoastCreditUnion.javaMain.Suncoast_Page_Objects;

import SuncoastCreditUnion.javaMain.ReusableMethods_With_Logger;
import com.relevantcodes.extentreports.ExtentTest;
import SuncoastCreditUnion.javaMain.Reusable_Annotations_Class_Html_Report;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpBusinessCountyPage extends Reusable_Annotations_Class_Html_Report {
    public ExtentTest logger;
    public SignUpBusinessCountyPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
        this.logger = Reusable_Annotations_Class_Html_Report.logger;
    }

    @FindBy(xpath = "//*[@class='ctl00_MainContent_FOMWizard_rptStartingQuestions_ctl00_rbStartingQuestion']")
    private WebElement BusinessSpaceInFloridaTicker;
    @FindBy(xpath = "//select[@name='ctl00$MainContent$FOMWizard$rptStartingQuestions$ctl00$rptFOMQuestionSteps$ctl00$FOMQuestionStep$rptQuestions$ctl00$fomQuestion$ddlAnswer']")
    private WebElement EligibleCountySelector;
    @FindBy(xpath = "//*[@name='ctl00$MainContent$FOMWizard$rptStartingQuestions$ctl00$btnContinue']")
    private WebElement EligibleCountyContinueBtn;

    public void ClickOnBusinessSpaceInFloridaTicker()
    {
        ReusableMethods_With_Logger.click(driver,BusinessSpaceInFloridaTicker,"click on space in florida",logger);
    }
    public void SelectEligibleCounty()
    {
        ReusableMethods_With_Logger.selectDropdownByIndex(driver,EligibleCountySelector,"2","select eligible county",logger);
    }
    public void ClickOnEligibleCountyContinueBtn()
    {
        ReusableMethods_With_Logger.click(driver,EligibleCountyContinueBtn,"click on continue",logger);
    }

}
