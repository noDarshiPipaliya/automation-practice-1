package com.automation.excelutility.testsuite;

import com.automation.pages.HomePage;
import com.automation.pages.SignInPage;
import com.automation.testbase.TestBase;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import resources.testdata.TestData;


public class SignPageTest extends TestBase {

    HomePage homePage;
    SignInPage SignInPage;

    @BeforeMethod
    public void inIt(){
        homePage = new HomePage();
        SignInPage = new SignInPage();
    }


   @Test(groups = {"smoke","regression"})
    public void userShouldNavigateToSignInPageSuccessFully() {
       homePage.clickOnsighinLink();
       String expectedMessage = "AUTHENTICATION";
       String actualMessage = SignInPage.getTextFromElement(By.xpath("//h1[contains(text(),'Authentication')]"));
       Assert.assertEquals(expectedMessage, actualMessage, "signin page  displayed");

   }

    @Test(dataProvider = "credentials",dataProviderClass = TestData.class)
    public void verifyTheErrorMessageWithInValidCredentials(String username, String password,String message){
        homePage.clickOnsighinLink();
        SignInPage.signinToApplication(username,password,message);
    }

//    @Test
//    public void verifyThatUserShouldLogInSuccessFullyWithValidCredentials(String username, String password,String message){
//        homePage.clickOnsighinLink();
//        SignInPage.signinToApplication(username,password,message);
//    }
//
//    @Test
//    public void verifyThatUserShouldLogOutSuccessFully(String username, String password,String message){
//        homePage.clickonsignoutlink();
//
//    }



}




