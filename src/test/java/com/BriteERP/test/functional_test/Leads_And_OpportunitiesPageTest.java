package com.BriteERP.test.functional_test;

import com.BriteERP.utilietes.Driver;
import com.BriteERP.utilietes.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Leads_And_OpportunitiesPageTest extends TestBase {

    @Test(priority = 1 )
    public void leadTagsTest() {
        extentLogger = report.createTest("Leads & Opportunities");


        extentLogger.info("Login to website");
        pages.loginPage().singin("EventsCRM_Manager@info.com","Ugh45wQ12");

        extentLogger.info("Click on CRM");
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.elementToBeClickable(pages.crmPage().crmButtn)).click();

        extentLogger.info("click on lead_And_Opportunities");
        wait.until(ExpectedConditions.elementToBeClickable(pages.crmPage().lead_And_Opportunities)).click();

        extentLogger.info("click on leadTags");
        wait.until(ExpectedConditions.elementToBeClickable(pages.leads_and_opportunitiesPage().leadTags)).click();

        extentLogger.info("Verifying if crm is clickable");
        Assert.assertTrue(pages.crmPage().crmButtn.isDisplayed());

        extentLogger.info("Verifying if lead and opportunities is clicakble");
        Assert.assertTrue(pages.crmPage().lead_And_Opportunities.isDisplayed());

        extentLogger.info("Verifying if lead tags is clickable");
        Assert.assertTrue(pages.leads_and_opportunitiesPage().leadTags.isDisplayed());


       Driver.closeDriver();


    }

    @Test(priority = 2)
    public void LostReasonsTest() {
        extentLogger = report.createTest("Leads & Opportunities");


        extentLogger.info("Login to website");
        pages.loginPage().singin("EventsCRM_Manager@info.com","Ugh45wQ12");

        extentLogger.info("Click on CRM");
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.elementToBeClickable(pages.crmPage().crmButtn)).click();

        extentLogger.info("click on lead_And_Opportunities");
        wait.until(ExpectedConditions.elementToBeClickable(pages.crmPage().lead_And_Opportunities)).click();

        extentLogger.info("click on Lost Reasons");
        wait.until(ExpectedConditions.elementToBeClickable(pages.leads_and_opportunitiesPage().LostReasons)).click();

        extentLogger.info("Verifying if crm is clickable");
        Assert.assertTrue(pages.crmPage().crmButtn.isDisplayed());

        extentLogger.info("Verifying if lead and opportunities is clicakble");
        Assert.assertTrue(pages.crmPage().lead_And_Opportunities.isDisplayed());

        extentLogger.info("Verifying if Lost Reasons is clickable");
        Assert.assertTrue(pages.leads_and_opportunitiesPage().LostReasons.isDisplayed());


    }

}
