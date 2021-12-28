package com.amazon.pages;

import com.amazon.utility.Utility;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


import static jdk.nashorn.internal.objects.Global.print;

public class LoptopPage extends Utility {

    public LoptopPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
    WebElement searchbar;

    @CacheLookup
    @FindBy(xpath = "//input[@id='nav-search-submit-button']")
    WebElement searchButton;

    @CacheLookup
    @FindBy(xpath = "//span[@class='a-size-medium a-color-base a-text-normal']")
    List<WebElement> laptopList;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'2')]")
    WebElement page2;

    @CacheLookup
    @FindBy(linkText = "3")
    WebElement page3;

    @CacheLookup
    @FindBy(linkText = "4")
    WebElement page4;

    @FindBy(xpath = "//span[contains(text(),'HP')]")//2021 Newest Dell Business Laptop Latitude 3520, 15
    WebElement lenovoLaptop;
    @FindBy(xpath = "//i[@class='a-icon a-icon-close a-icon-medium aod-close-button']")
    WebElement popupclose;
    @CacheLookup
    @FindBy(xpath = "//select[@id='quantity']")//span[@id='a-autoid-0-announce']
    WebElement qtyDropdown;

    @CacheLookup
    @FindBy(xpath = "//a[@id='quantity_2']")
    WebElement selectQty;

    @CacheLookup
    @FindBy(css = "#add-to-cart-button")
    WebElement addToCartButton;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Added to Cart')]")
    WebElement addedCartText;


    public void searchForLaptop(String text) {
        sendTextToElement(searchbar,text);
    }

    public void clickOnSerchButton() {
        clickOnElement(searchButton);
    }

    public List<WebElement> verifyLaptopList() {
        return getListFromElement(laptopList);
    }
public void closePopUp(){
        clickOnElement(popupclose);
}
    public void clickOnSecondPage() throws InterruptedException {
        Thread.sleep(1000);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,7000);",page2);
        clickOnElement(page2);
    }

    public void clickOnThirdPage() throws InterruptedException {
        Thread.sleep(1000);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,7000);",page3);
        clickOnElement(page3);
    }

    public void clickOnNext() throws InterruptedException {
        Thread.sleep(1000);
//        JavascriptExecutor js = (JavascriptExecutor)driver;
//        js.executeScript("window.scrollBy(0,7000);",page4);
        clickOnElement(page4);
    }

    public void selectLenovoLaptop()  {

//        JavascriptExecutor js = (JavascriptExecutor)driver;
//        js.executeScript("window.scrollBy(0,4500);",lenovoLaptop);
        clickOnElement(lenovoLaptop);
    }

    public String verifyLaptopIsDisplayed(){
        return getTextFromElement(lenovoLaptop);
    }

    public void clickOnQuantityDropDownList(String value){
       // clickOnElement(qtyDropdown);
        //clickOnElement(selectQty);
 selectByValueFromDropDown(qtyDropdown,value);
    }

    public void clickOnAddToCartButton(){
        clickOnElement(addToCartButton);
    }

    public String verifyAddedToCartText(){
        return getTextFromElement(addedCartText);
    }

}
