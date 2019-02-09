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
    public void activitiesPage() {
        extentLogger = report.createTest("Click on Activities");

        extentLogger.info("Login to website");
        pages.loginPage().singin("EventsCRM_Manager@info.com", "Ugh45wQ12");

        extentLogger.info("Click on CRM");
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.elementToBeClickable(pages.crmPage().crmButtn)).click();

        extentLogger.info("click on ACTIVITIES");
        wait.until(ExpectedConditions.visibilityOf(pages.activitiesPage().activities));
        pages.activitiesPage().activities.click();

        extentLogger.info("verifying if ACTIVITIES is displayed");
        Assert.assertTrue(pages.activitiesPage().activities.isDisplayed());
        System.out.println(pages.activitiesPage().activities.isDisplayed());



        Driver.closeDriver();

    }

    @Test
    public void search_Button(){
        extentLogger = report.createTest("Search Button Test");

        extentLogger.info("Login to website");
        pages.loginPage().singin("EventsCRM_Manager@info.com", "Ugh45wQ12");

        extentLogger.info("Click on CRM");
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.elementToBeClickable(pages.crmPage().crmButtn)).click();

        extentLogger.info("click on ACTIVITIES");
        wait.until(ExpectedConditions.visibilityOf(pages.activitiesPage().activities));
        pages.activitiesPage().activities.click();


        extentLogger.info("Click on Search Button");
        pages.activitiesPage().searchButton.click();

        pages.activitiesPage().searchButton.click();

    }

    @Test
    public void measures() throws InterruptedException {
        extentLogger = report.createTest("Measures Button Test");

        extentLogger.info("Login to website");
        pages.loginPage().singin("EventsCRM_Manager@info.com", "Ugh45wQ12");

        extentLogger.info("Click on CRM");
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.elementToBeClickable(pages.crmPage().crmButtn)).click();

        extentLogger.info("click on ACTIVITIES");
        wait.until(ExpectedConditions.visibilityOf(pages.activitiesPage().activities));
        pages.activitiesPage().activities.click();


        Thread.sleep(15000);
        extentLogger.info("click on Measures button");
        pages.activitiesPage().measuresClick.click();


        extentLogger.info("verifying that if Measures button is displayed");
        Assert.assertTrue(pages.activitiesPage().measuresClick.isDisplayed());
        System.out.println(pages.activitiesPage().measuresClick.isDisplayed());

        Driver.closeDriver();


    }

    @Test()
    public void filters() {
        extentLogger = report.createTest("Filters Button Test");

        extentLogger.info("Login to website");
        pages.loginPage().singin("EventsCRM_Manager@info.com", "Ugh45wQ12");

        extentLogger.info("Click on CRM");
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.elementToBeClickable(pages.crmPage().crmButtn)).click();

        extentLogger.info("click on ACTIVITIES");
        wait.until(ExpectedConditions.visibilityOf(pages.activitiesPage().activities));
        pages.activitiesPage().activities.click();

        extentLogger.info("click on SEARCH_BUTTON");
        pages.activitiesPage().searchButton.click();


        extentLogger.info("Click on Filters button");
        pages.activitiesPage().filtersClick.click();

        extentLogger.info("Verifying that if Filters is displayed");
        Assert.assertTrue(pages.activitiesPage().filtersClick.isDisplayed());
        System.out.println(pages.activitiesPage().filtersClick.isDisplayed());


        Driver.closeDriver();
    }

    @Test
    public void group_By() throws InterruptedException {
        extentLogger = report.createTest("Group_By Button Test");


        extentLogger.info("Login to website");
        pages.loginPage().singin("EventsCRM_Manager@info.com", "Ugh45wQ12");

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
        pages.activitiesPage().groupClick.click();

//        extentLogger.info("click on GROUP_BY");
//        pages.activitiesPage().groupClick.click();


        extentLogger.info("verifying if GROUP_BY is displayed");
        Assert.assertTrue(pages.activitiesPage().groupClick.isDisplayed());

        extentLogger.info("verifying if SEARCH_BUTTON is not equal to myOpportunities");
        Assert.assertTrue(!pages.activitiesPage().searchButton.getText().equals("myOpportunities"));

        Driver.closeDriver();
    }

    @Test
    public void favorites() throws InterruptedException {
        extentLogger = report.createTest("Favorites Button Test");

        extentLogger.info("Login to website");
        pages.loginPage().singin("EventsCRM_Manager@info.com", "Ugh45wQ12");

        extentLogger.info("Click on CRM");
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.elementToBeClickable(pages.crmPage().crmButtn)).click();

        extentLogger.info("click on ACTIVITIES");
        wait.until(ExpectedConditions.visibilityOf(pages.activitiesPage().activities));
        pages.activitiesPage().activities.click();

        extentLogger.info("click on SEARCH_BUTTON");
        pages.activitiesPage().searchButton.click();


        Thread.sleep(15000);
        extentLogger.info("Click on Favorites");
        pages.activitiesPage().favoritesClick.click();

        extentLogger.info("Verifying if Favorites is displayed");
        Assert.assertTrue(pages.activitiesPage().favoritesClick.isDisplayed());
        System.out.println(pages.activitiesPage().favoritesClick.isDisplayed());

        Driver.closeDriver();

    }


}
