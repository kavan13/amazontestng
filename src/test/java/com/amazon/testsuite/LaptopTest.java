package com.amazon.testsuite;

import com.amazon.customlisteners.CustomListeners;
import com.amazon.pages.LoptopPage;
import com.amazon.testbase.TestBase;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;


@Listeners(CustomListeners.class)
public class LaptopTest extends TestBase {
LoptopPage loptopPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        loptopPage = new LoptopPage();
    }

    @Test
    public void verifyLaptop() throws InterruptedException {
       loptopPage.searchForLaptop("laptop");
       loptopPage.clickOnSerchButton();
      // loptopPage.verifyLaptopList();
//        List<WebElement> laptop = loptopPage.verifyLaptopList();
//        List<String> laptop1 = new ArrayList<>();
//        for (WebElement productName : laptop) {
//            laptop1.add(productName.getText());
//        }
//        List<String> tempList = new ArrayList<>();
//        tempList.addAll(laptop1);
//        System.out.println(laptop1);
//        System.out.println(tempList);
//        Assert.assertEquals(laptop1,tempList);
       loptopPage.clickOnSecondPage();
     //  loptopPage.closePopUp();
       loptopPage.clickOnThirdPage();
       loptopPage.clickOnNext();
       Thread.sleep(500);
       loptopPage.selectLenovoLaptop();
    //    loptopPage.clickOnAddToCartButton();
      //  loptopPage.verifyLaptopIsDisplayed();
      loptopPage.clickOnQuantityDropDownList("3");
      loptopPage.clickOnAddToCartButton();
      Thread.sleep(5000);
       loptopPage.verifyAddedToCartText();


    }
}
