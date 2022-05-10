package com.automation.excelutility.testsuite;

import com.automation.pages.CreateAccountPage;
import com.automation.pages.HomePage;
import com.automation.testbase.TestBase;
import org.testng.annotations.Test;
import resources.testdata.TestData;

public class CreateAccountPageTest extends TestBase {

    HomePage homePage;
    CreateAccountPage createAccountPage;

    public void init1(){
    homePage = new HomePage();
    createAccountPage = new CreateAccountPage();}

    @Test(dataProvider = "credentials",dataProviderClass = TestData.class)
    public void verifyThatUserShouldCreateAccountSuccessfully(){
        homePage.clickOnsighinLink();
        createAccountPage.clickemaillink();
        createAccountPage.clickregisterbuttonlink();
        createAccountPage.clickfirstnamelink();
        createAccountPage.clicklastnamelink();
        createAccountPage.clickpasswordlink();
        createAccountPage.clickaddfirstnamelink();
        createAccountPage.clickaddlastnamelink();
        createAccountPage.clickaddresslink();
        createAccountPage.clickemaillink();
        createAccountPage.clickcitylink();
        createAccountPage.clickstatelink();
        createAccountPage.clickzipcodelink();
        createAccountPage.clickcountrylink();
        createAccountPage.clickmobilephonelink();
        createAccountPage.clickreferencelink();
        createAccountPage.clickregisterbuttonlink();


    }
}
