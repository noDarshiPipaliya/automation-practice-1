package com.automation.pages;

import com.automation.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WomenCategoryPage extends Utility {

    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[1]/a[1]")
    WebElement WomenText;

    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[1]/ul[1]/li[1]/a[1]")
    WebElement TOPS;

    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/a[1]")
    WebElement Dresses;

    @FindBy(xpath = "//select[@id='selectProductSort']")
    WebElement SortbyDropdown;


    public void clickwomentextlink() {
        clickOnElement(WomenText);
    }

    public void clicktopslink() {
        clickOnElement(TOPS);
    }

    public void clickdresseslink() {
        clickOnElement(Dresses);
    }

    public void clicksortbylink() {
        clickOnElement(SortbyDropdown);
        selectByValueFromDropDown(By.id("selectProductSort"), "Price: Lowest first");
    }


}
