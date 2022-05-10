package com.automation.pages;

import com.automation.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccountPage extends Utility {

    @FindBy(id = "customer_firstname")
    WebElement FirstName;

    @FindBy(id = "customer_lastname")
    WebElement LastName;

    @FindBy(id = "email")
    WebElement Email;

    @FindBy(id = "passwd")
    WebElement Password;

    @FindBy(id = "firstname")
    WebElement AddFirstname;

    @FindBy(id ="lastname")
    WebElement AddLastname;

    @FindBy(id = "address1")
    WebElement Address;

    @FindBy(id = "city")
    WebElement City;

    @FindBy(id = "id_state")
    WebElement State;

    @FindBy(id = "postcode")
    WebElement Zipcode;

    @FindBy(id = "id_country")
    WebElement Country;

    @FindBy(id = "phone_mobile")
    WebElement Mobilephone;

    @FindBy(id = "alias")
    WebElement Reference;

    @FindBy(xpath= "//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/div[4]/button[1]/span[1]")
    WebElement Registerbutton;

    public void clickfirstnamelink() {
        clickOnElement(FirstName);
    }

    public void clicklastnamelink() {
        clickOnElement(LastName);
    }

    public void clickemaillink() {
        clickOnElement(Email);
    }

    public void clickpasswordlink() {
        clickOnElement(Password);
    }

    public void clickaddfirstnamelink() {
        clickOnElement(AddFirstname);
    }

    public void clickaddlastnamelink() {
        clickOnElement(AddLastname);
    }

    public void clickaddresslink() {
        clickOnElement(Address);
    }

    public void clickcitylink() {
        clickOnElement(City);
    }

    public void clickstatelink() {
        clickOnElement(State);
       selectByValueFromDropDown(By.id("id_state"),"22");
    }

    public void clickzipcodelink() {
        clickOnElement(Zipcode);
    }

    public void clickcountrylink() {
        clickOnElement(Country);
        selectByValueFromDropDown(By.id("id_country"),"21");
    }

    public void clickmobilephonelink() {
        clickOnElement(Mobilephone);
    }

    public void clickreferencelink() {
        clickOnElement(Reference);
    }

    public void clickregisterbuttonlink() {
        clickOnElement(Registerbutton);
    }

   // public void messageelement(String message){

    }

//    public void loginToApplication(String username, String password,String message){
//        clickemaillink(username);
//        clickpasswordlink(password);
//        messageelement(message);
//        clickregisterbuttonlink();
//    }



