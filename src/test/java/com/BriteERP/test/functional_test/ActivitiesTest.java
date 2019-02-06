package com.BriteERP.test.functional_test;


import com.BriteERP.utilietes.Driver;
import com.BriteERP.utilietes.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ActivitiesTest extends TestBase {

    @Test
    public void activitiesTest() throws InterruptedException {
        extentLogger = report.createTest("Activities Test");


        extentLogger.info("Login to website");
        pages.loginPage().singin("EventsCRM_Manager@info.com","Ugh45wQ12");

        extentLogger.info("Click on CRM");
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.elementToBeClickable(pages.crmPage().crmButtn)).click();

        extentLogger.info("click on ACTIVITIES");
        wait.until(ExpectedConditions.visibilityOf(pages.activitiesPage().activities));
        pages.activitiesPage().activities.click();

        extentLogger.info("click on SEARCH_BUTTON");
        pages.activitiesPage().searchButton.click();

        Thread.sleep(15000);
        extentLogger.info("click on GROUP_BY");
        pages.activitiesPage().selectElement.click();

        extentLogger.info("click on GROUP_BY");
        pages.activitiesPage().selectElement.click();


        extentLogger.info("Click on Favorites");
        pages.activitiesPage().favoritesClick.click();
        Assert.assertTrue(pages.activitiesPage().favoritesClick.isDisplayed());
        System.out.println(pages.activitiesPage().favoritesClick.isDisplayed());



        extentLogger.info("verifying if ACTIVITIES is displayed");
        Assert.assertTrue(pages.activitiesPage().activities.isDisplayed());

        extentLogger.info("verifying if SEARCH_BUTTON is displayed");
        Assert.assertTrue(pages.activitiesPage().searchButton.isDisplayed());

        extentLogger.info("verifying if GROUP_BY is displayed");
        Assert.assertTrue(pages.activitiesPage().selectElement.isDisplayed());

        extentLogger.info("verifying if SEARCH_BUTTON is not equal to myOpportunities");
        Assert.assertTrue(!pages.activitiesPage().searchButton.getText().equals("myOpportunities"));





    }

}
