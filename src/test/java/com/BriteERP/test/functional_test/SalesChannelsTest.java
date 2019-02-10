package com.BriteERP.test.functional_test;

import com.BriteERP.pages.LoginPage;
import com.BriteERP.pages.SalesChannelsPage;
import com.BriteERP.utilietes.ApplicationConstants;
import com.BriteERP.utilietes.Driver;
import com.BriteERP.utilietes.TestBase;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SalesChannelsTest extends TestBase {

    @Test()
    public void pipelineCreate() {

        extentLogger = report.createTest("Sales Channels Test");

        extentLogger.info("Login to Webpage");
        pages.loginPage().singin("EventsCRM_Manager@info.com", "Ugh45wQ12");

        extentLogger.info("Click on CRM");
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.elementToBeClickable(pages.crmPage().crmButtn)).click();

        extentLogger.info("Click to first Sales Channels button");
        pages.salesChannelsPage().salesChannelsButton.click();

        extentLogger.info("Click to first pipeline button");
        pages.salesChannelsPage().pipelineButton.click();

        extentLogger.info("Click to Create button");
        pages.salesChannelsPage().createButton.click();

        extentLogger.info("Click to discard button");
        pages.salesChannelsPage().discardButton.click();

        extentLogger.info("verifying Sales Channels is displayed");
        Assert.assertTrue(pages.salesChannelsPage().salesChannelsButton.isDisplayed());


    }

    @Test()
    public void pipelineImport() {

        extentLogger = report.createTest("Sales Channels Test");

        extentLogger.info("Login to Webpage");
        pages.loginPage().singin("EventsCRM_Manager@info.com", "Ugh45wQ12");

        extentLogger.info("Click on CRM");
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.elementToBeClickable(pages.crmPage().crmButtn)).click();

        extentLogger.info("Click to first Sales Channels button");
        pages.salesChannelsPage().salesChannelsButton.click();

        extentLogger.info("Click to first pipeline button");
        pages.salesChannelsPage().pipelineButton.click();

        extentLogger.info("Click to Create button");
        pages.salesChannelsPage().importButton.click();

        extentLogger.info("verifying Create button is displayed");
        Assert.assertTrue(pages.salesChannelsPage().importButton.isDisplayed());


    }

}





