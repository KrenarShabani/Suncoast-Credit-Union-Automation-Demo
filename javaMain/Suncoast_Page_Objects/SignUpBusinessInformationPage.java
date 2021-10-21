package SuncoastCreditUnion.javaMain.Suncoast_Page_Objects;

import com.relevantcodes.extentreports.ExtentTest;
import SuncoastCreditUnion.javaMain.Reusable_Annotations_Class_Html_Report;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpBusinessInformationPage extends Reusable_Annotations_Class_Html_Report {
    public ExtentTest logger;
    public SignUpBusinessInformationPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
        this.logger = Reusable_Annotations_Class_Html_Report.logger;
    }
    @FindBy(xpath = "//input[@name='ctl00$ctl00$bodyContent$MainContent$CompanyName']")
    private WebElement companyName;
    @FindBy(xpath = "//input[@name='ctl00$ctl00$bodyContent$MainContent$BusinessTaxID']")
    private WebElement taxID;
    @FindBy(xpath = "//select[@name='ctl00$ctl00$bodyContent$MainContent$BusinessType']")
    private WebElement businessType;
    @FindBy(xpath="//select[@name='ctl00$ctl00$bodyContent$MainContent$Industry']")
    private WebElement businessIndustry;
    @FindBy(xpath="//input[@name='ctl00$ctl00$bodyContent$MainContent$BusinessEstablishedDate']")
    private WebElement businessEstablishedDate;
    @FindBy(xpath="//textarea[@name='ctl00$ctl00$bodyContent$MainContent$BusinessDescription']")
    private WebElement businessDescription;
    @FindBy(xpath = "//input[@name='ctl00$ctl00$bodyContent$MainContent$BusinessAddress$streetAddress1']")
    private WebElement streetAddress;
    @FindBy(xpath = "//input[@name='ctl00$ctl00$bodyContent$MainContent$BusinessAddress$ZipTextBox']")
    private WebElement zipCode;
    @FindBy(xpath = "//input[@name='ctl00$ctl00$bodyContent$MainContent$BusinessAddress$cityTextBox']")
    private WebElement city;
    @FindBy (xpath = "//select[@name='ctl00$ctl00$bodyContent$MainContent$BusinessAddress$StateDropDown']")
    private WebElement state;
    @FindBy (xpath = "//select[@name='ctl00$ctl00$bodyContent$MainContent$BusinessAddressOccupancyInfo$ddlOccupancyStatus']")
    private WebElement occupancyStatus;
    @FindBy(xpath = "//input[@name='ctl00$ctl00$bodyContent$MainContent$BusinessAddressOccupancyInfo$ResidenceDuration$Years']")
    private WebElement occupancyYears;
    @FindBy(xpath = "//select[@name='ctl00$ctl00$bodyContent$MainContent$BusinessAddressOccupancyInfo$ResidenceDuration$Months']")
    private WebElement occupancyMonths;
    @FindBy (xpath = "//input[@name='ctl00$ctl00$bodyContent$MainContent$PhoneNumber']")
    private WebElement phonenumber;
    @FindBy (xpath = "//input[@name='ctl00$ctl00$bodyContent$MainContent$Email']")
    private WebElement email;
    @FindBy (xpath = "//*[@name='ctl00$ctl00$bodyContent$Buttons$nav$btnNext']")
    private WebElement continueBtn;

}
