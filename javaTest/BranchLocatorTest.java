package SuncoastCreditUnion.javaTest;

import SuncoastCreditUnion.javaMain.Suncoast_Page_Objects.BaseClass;
import SuncoastCreditUnion.javaMain.Reusable_Annotations_Class_Html_Report;
import org.testng.annotations.Test;

public class BranchLocatorTest extends Reusable_Annotations_Class_Html_Report{

    @Test
    public static void BranchLocatorTest() throws InterruptedException
    {
        BaseClass.basePage();
        Thread.sleep(2000);
        BaseClass.homePage().HoverBranchLocatorLink();
        Thread.sleep(500);
        BaseClass.homePage().ClickOnBranchLocatorLink();
        Thread.sleep(2000);
        BaseClass.branchLocatorPage().FillAddressField();
        BaseClass.branchLocatorPage().HitEnterOnAddressField();
        Thread.sleep(3000);
        BaseClass.branchLocatorPage().GetFirstResultFromBranchSearch();


    }
}
