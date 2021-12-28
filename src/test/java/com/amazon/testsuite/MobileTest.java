package com.amazon.testsuite;

import com.amazon.pages.LoptopPage;
import com.amazon.pages.MobilePage;
import com.amazon.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MobileTest extends TestBase {
    MobilePage mobilePage;

    @BeforeMethod(alwaysRun = true)
    public void inIt1() {
        mobilePage = new MobilePage();
    }

    @Test
    public void verifyLaptop() throws InterruptedException {
        mobilePage.searchForMobile("Mobile Phone");
        mobilePage.clickOnSerchButton();
     //   mobilePage.verifyMobileList();
        mobilePage.clickOnSecondPage();
        mobilePage.clickOnThirdPage();
        mobilePage.clickOnNext();
        Thread.sleep(500);
        mobilePage.selectNokiaPhone();
       // mobilePage.verifyMobileIsDisplayed();
      //  mobilePage.clickOnQuantityDropDownList("2");
        mobilePage.clickOnAddToCartButton();
        Thread.sleep(5000);
        mobilePage.verifyAddedToCartText();
    }
}