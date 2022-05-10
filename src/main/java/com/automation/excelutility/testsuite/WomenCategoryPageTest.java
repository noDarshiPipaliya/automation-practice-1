package com.automation.excelutility.testsuite;

import com.automation.pages.ProductPage;
import com.automation.pages.WomenCategoryPage;
import com.automation.testbase.TestBase;
import org.testng.annotations.Test;
import resources.testdata.TestData;

public class WomenCategoryPageTest extends TestBase {

    WomenCategoryPage womenCategoryPage;
    ProductPage productPage;

    public void init(){
        womenCategoryPage = new WomenCategoryPage();
        productPage = new ProductPage();
    }

    @Test(dataProvider = "product",dataProviderClass = TestData.class)
    public void verifyUserShouldNavigateToWomenCategoryPageSuccessfully(){
        womenCategoryPage.clickwomentextlink();
        womenCategoryPage.clickdresseslink();
        womenCategoryPage.clicktopslink();
        productPage.clickonprinteddress();
        productPage.clicksizedropdowmlink();
        productPage.clickquantitylink();
        productPage.clickcolourlink();
        productPage.clickaddtocartlink();

    }

}
