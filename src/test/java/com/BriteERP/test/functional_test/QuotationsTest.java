package com.BriteERP.test.functional_test;

import com.BriteERP.utilietes.ConfigurationReader;
import com.BriteERP.utilietes.Driver;
import com.BriteERP.utilietes.TestBase;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class QuotationsTest extends TestBase {


    @Test
    public void  clickOnQuotations() throws InterruptedException {
        extentLogger = report.createTest("Automating ");
        extentLogger.info("Log in into Website as a Manager");
        pages.loginPage().singin(ConfigurationReader.getProperty("manager"), ConfigurationReader.getProperty("managerpass"));
        extentLogger.info("Click on CRM module");
        pages.crmPage().crmButtn.click();
       waitForClickablility(pages.quotationsPage().quotButton, 5);
        extentLogger.info("Click on Quotations functionality");
        //Thread.sleep(5000);
        pages.quotationsPage().quotButton.click();



    }

    @Test
    public void clickCreateButton () {
        extentLogger = report.createTest("Automating ");
        extentLogger.info("Log in into Website as a Manager");
        pages.loginPage().singin(ConfigurationReader.getProperty("manager"), ConfigurationReader.getProperty("managerpass"));
        extentLogger.info("Click on CRM module");
        pages.crmPage().crmButtn.click();
        waitForClickablility(pages.quotationsPage().quotButton, 5);
        extentLogger.info("Click on Quotations functionality");
        pages.quotationsPage().quotButton.click();
        waitForClickablility(pages.quotationsPage().createButton, 5);
        extentLogger.info("Click on Create button");
        pages.quotationsPage().createButton.click();
    }

    @Test
    public void enterCustomer(){
        extentLogger = report.createTest("Automating ");
        extentLogger.info("Log in into Website as a Manager");
        pages.loginPage().singin(ConfigurationReader.getProperty("manager"), ConfigurationReader.getProperty("managerpass"));
        extentLogger.info("Click on CRM module");
        pages.crmPage().crmButtn.click();
        waitForClickablility(pages.quotationsPage().quotButton, 5);
        extentLogger.info("Click on Quotations functionality");
        pages.quotationsPage().quotButton.click();
        waitForClickablility(pages.quotationsPage().createButton, 5);
        extentLogger.info("Click on Create button");
        pages.quotationsPage().createButton.click();

        extentLogger.info("Click on dropdown box");
        pages.quotationsPage().select1.click();




        }

    }
