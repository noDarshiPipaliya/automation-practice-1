package com.automation.pages;

import com.automation.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends Utility {

    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[2]/h5[1]/a[1]")
    WebElement Printeddress;

    @FindBy(xpath = "//input[@id='quantity_wanted']")
    WebElement Quantity;

    @FindBy(xpath = "//select[@id='group_1']")
    WebElement SizedropDown;

    @FindBy(id = "color_13")
    WebElement Colour;

    @FindBy(xpath = "//span[contains(text(),'Add to cart')]")
    WebElement addtoCartButtom;


    public void clickonprinteddress(){
        clickOnElement(Printeddress);
    }

    public void clickquantitylink() {
        clickOnElement(Quantity);
        sendTextToElement(By.xpath("//input[@id='quantity_wanted']"),"2");
    }

    public void clicksizedropdowmlink() {
        clickOnElement(SizedropDown);
        selectByValueFromDropDown(By.xpath("//select[@id='group_1']"),"1");
    }

    public void clickcolourlink() {
        clickOnElement(Colour);
    }

    public void clickaddtocartlink() {
        clickOnElement(addtoCartButtom);
    }


}
