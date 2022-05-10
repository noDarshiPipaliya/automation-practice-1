package com.automation.pages;

import com.automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends Utility {

    public HomePage() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[1]/a[1]")
    WebElement WOMEN;

    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/a[1]")
    WebElement DRESSES;

    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[3]/a[1]")
    WebElement TSHIRTS;

    @FindBy(xpath = "//a[contains(text(),'Sign in')]")
    WebElement SigninLink;

    @FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[1]/a[1]/img[1]")
    WebElement displaylogo;

    @FindBy(xpath = "//header/div[2]/div[1]/div[1]/nav[1]/div[2]/a[1]")
    WebElement signout;


    //By loginLink = By.linkText("Log in");

    //By registerLink = By.linkText("Register");
    public void setDisplaylogo() {
        clickOnElement(displaylogo);
    }

    public void clickOnwomenlink() {
        clickOnElement(WOMEN);
    }

    public void clickOndressesLink() {
        clickOnElement(DRESSES);
    }

    public void clickOntshirtsLink() {
        clickOnElement(TSHIRTS);
    }

    public void clickOnsighinLink() {
        clickOnElement(SigninLink);
    }

    public void clickonsignoutlink(){
        clickOnElement(signout);
    }

}
