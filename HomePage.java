package SuncoastCreditUnion;
import Day_7.ReusableMethods_With_Logger;
import com.relevantcodes.extentreports.ExtentTest;
import extent.Reusable_Annotations_Class_Html_Report;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePage extends Reusable_Annotations_Class_Html_Report {

    public ExtentTest logger;
    public HomePage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
        this.logger = Reusable_Annotations_Class_Html_Report.logger;
    }
    @FindBy(xpath = "/html/body/div[2]/header/div/div[3]/nav[1]/ul/li[4]/a")
    private WebElement branchLocatorLink;
    @FindBy(xpath = "//*[text()='Business']")
    private WebElement BusinessPageTab;
    @FindBy(xpath = "//*[@id=\"Form1\"]/header/div/div[3]/nav[1]/ul/li[2]/a")
    private WebElement joinLink;

    public void HoverBranchLocatorLink()
    {
        Actions action = new Actions(driver);
        ReusableMethods_With_Logger.mouseHover(driver,branchLocatorLink,"hovering over branch locator link",logger);
    }
    public void ClickOnBranchLocatorLink() throws InterruptedException 
    {
        ReusableMethods_With_Logger.click(driver,branchLocatorLink,"Click on Branch Locator Link",logger);
    }

    public void ClickOnBusinessTab()
    {
        ReusableMethods_With_Logger.click(driver,BusinessPageTab,"Clicking on Business Tab",logger);
    }
    public void ClickOnJoinLink()
    {
        ReusableMethods_With_Logger.click(driver,joinLink,"click on join link",logger);
    }

}
