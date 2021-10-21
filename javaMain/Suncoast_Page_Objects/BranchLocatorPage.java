package SuncoastCreditUnion.javaMain.Suncoast_Page_Objects;

import SuncoastCreditUnion.javaMain.ReusableMethods_With_Logger;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import SuncoastCreditUnion.javaMain.Reusable_Annotations_Class_Html_Report;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BranchLocatorPage extends Reusable_Annotations_Class_Html_Report {
    public ExtentTest logger;
    public BranchLocatorPage (WebDriver driver)
    {
        PageFactory.initElements(driver,this);
        this.logger = Reusable_Annotations_Class_Html_Report.logger;
    }
    @FindBy(xpath ="//*[@class='inputAddress']" )
    private WebElement AddressField;
    @FindBy(xpath = "//*[@class='location-info']")
    private WebElement Location;

    public void FillAddressField()
    {
        ReusableMethods_With_Logger.sendKeys(driver,AddressField,"33614","input zipcode in text field",logger);
    }
    public void HitEnterOnAddressField()
    {
        ReusableMethods_With_Logger.sendKeys(driver,AddressField,Keys.ENTER,"hit enter on address input field",logger);
    }
    public void GetFirstResultFromBranchSearch()
    {
        logger.log(LogStatus.PASS, "Got address of nearest Branch: " + Location.getText());
    }
}
