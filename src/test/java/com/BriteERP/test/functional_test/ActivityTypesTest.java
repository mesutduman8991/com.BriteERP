package com.BriteERP.test.functional_test;

import com.BriteERP.pages.ActivityTypesPage;
import com.BriteERP.pages.CRMpage;
import com.BriteERP.pages.LoginPage;
import com.BriteERP.utilietes.*;
//import com.github.javafaker.Faker;
import javafx.scene.layout.Priority;
import net.bytebuddy.pool.TypePool;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class ActivityTypesTest extends TestBase {


    @Test()
    public void createButtonClickable() throws InterruptedException {

        LoginPage loginPage= new LoginPage();
        CRMpage crMpage= new CRMpage();
        extentLogger = report.createTest("Create button test on Activity Type page");
        extentLogger.info("Selecting BriteErpDemo button");
        loginPage.BriteErpDemo_button.click();
        extentLogger.info("Entering CRM_Maneger email address");
        loginPage.email.sendKeys("EventsCRM_Manager@info.com");
        extentLogger.info("Entering CRM_Maneger password");
        loginPage.password.sendKeys("Ugh45wQ12");
        extentLogger.info("Clicking on login button");
        loginPage.login.click();
        extentLogger.info("Clicking on CRM module");
        crMpage.crmButtn.click();
        extentLogger.info("Clicking on ActivityTypes functionality");
        pages.crmPage().activityTypes.click();
        extentLogger.info("Verify that Create is clickable.");
        pages.activityTypesPage().create.click();
        Assert.assertTrue(isClickable(pages.activityTypesPage().create));
        extentLogger.pass("Passed:  Create is clickable");

    }

    @Test
    public void typeInNameBox() throws InterruptedException {

        LoginPage loginPage= new LoginPage();
        CRMpage crMpage= new CRMpage();
        extentLogger = report.createTest("Create button test on Activity Type page");
        extentLogger.info("Selecting BriteErpDemo button");
        loginPage.BriteErpDemo_button.click();
        extentLogger.info("Entering CRM_Maneger email address");
        loginPage.email.sendKeys("EventsCRM_Manager@info.com");
        extentLogger.info("Entering CRM_Maneger password");
        loginPage.password.sendKeys("Ugh45wQ12");
        extentLogger.info("Clicking on login button");
        loginPage.login.click();
        extentLogger.info("Clicking on CRM module");
        crMpage.crmButtn.click();
        extentLogger.info("Clicking on ActivityTypes functionality");
        pages.crmPage().activityTypes.click();
        extentLogger.info("Click on Create button");
        pages.activityTypesPage().create.click();
        extentLogger.info("Type a Mesut in the name box");
        pages.activityTypesPage().createName.sendKeys("Mesut");
        String expexted= "Mesut";
        wait(10);
        String actual = pages.activityTypesPage().createName.getAttribute("value");
        Assert.assertEquals(actual,expexted);
        extentLogger.pass("Passed:  You can type in name box");

    }

    @Test
    public void defaultValueInDaysBox() throws InterruptedException {

        LoginPage loginPage= new LoginPage();
        CRMpage crMpage= new CRMpage();
        extentLogger = report.createTest("Create button test on Activity Type page");
        extentLogger.info("Selecting BriteErpDemo button");
        loginPage.BriteErpDemo_button.click();
        extentLogger.info("Entering CRM_Maneger email address");
        loginPage.email.sendKeys("EventsCRM_Manager@info.com");
        extentLogger.info("Entering CRM_Maneger password");
        loginPage.password.sendKeys("Ugh45wQ12");
        extentLogger.info("Clicking on login button");
        loginPage.login.click();
        extentLogger.info("Clicking on CRM module");
        crMpage.crmButtn.click();
        extentLogger.info("Clicking on ActivityTypes functionality");
        pages.crmPage().activityTypes.click();
        extentLogger.info("Click on Create button");
        pages.activityTypesPage().create.click();
        extentLogger.info("Verify the default value is zero in days box");
        Assert.assertEquals(pages.activityTypesPage().daysBox.getAttribute("value"),"0");
        extentLogger.pass("Passed: the default value is 0 in days box");
    }

    @Test
    public void typeInDaysBox() throws InterruptedException {

        LoginPage loginPage= new LoginPage();
        CRMpage crMpage= new CRMpage();
        extentLogger = report.createTest("Create button test on Activity Type page");
        extentLogger.info("Selecting BriteErpDemo button");
        loginPage.BriteErpDemo_button.click();
        extentLogger.info("Entering CRM_Maneger email address");
        loginPage.email.sendKeys("EventsCRM_Manager@info.com");
        extentLogger.info("Entering CRM_Maneger password");
        loginPage.password.sendKeys("Ugh45wQ12");
        extentLogger.info("Clicking on login button");
        loginPage.login.click();
        extentLogger.info("Clicking on CRM module");
        crMpage.crmButtn.click();
        extentLogger.info("Clicking on ActivityTypes functionality");
        pages.crmPage().activityTypes.click();
        extentLogger.info("Click on Create button");
        pages.activityTypesPage().create.click();
        extentLogger.info("Click in days box");
        pages.activityTypesPage().daysBox.click();
        extentLogger.info("Type 21 in the days box");
        pages.activityTypesPage().daysBox.sendKeys("21");
        String expexted= "21";
        wait(10);
        String actual = pages.activityTypesPage().daysBox.getAttribute("value");
        Assert.assertEquals(actual,expexted);
        extentLogger.pass("Passed:  You can type in days box");

    }

    @Test
    public void typeInDaysBox_N() throws InterruptedException {

        LoginPage loginPage= new LoginPage();
        CRMpage crMpage= new CRMpage();
        extentLogger = report.createTest("Create button test on Activity Type page");
        extentLogger.info("Selecting BriteErpDemo button");
        loginPage.BriteErpDemo_button.click();
        extentLogger.info("Entering CRM_Maneger email address");
        loginPage.email.sendKeys("EventsCRM_Manager@info.com");
        extentLogger.info("Entering CRM_Maneger password");
        loginPage.password.sendKeys("Ugh45wQ12");
        extentLogger.info("Clicking on login button");
        loginPage.login.click();
        extentLogger.info("Clicking on CRM module");
        crMpage.crmButtn.click();
        extentLogger.info("Clicking on ActivityTypes functionality");
        pages.crmPage().activityTypes.click();
        extentLogger.info("Click on Create button");
        pages.activityTypesPage().create.click();
        extentLogger.info("Click in days box");
        pages.activityTypesPage().daysBox.click();
        extentLogger.info("Type -1 in the days box");
        pages.activityTypesPage().daysBox.sendKeys("-1");
        String expexted= "0";
        wait(10);
        String actual = pages.activityTypesPage().daysBox.getAttribute("value");
        extentLogger.info("Verify that you can't type negative number in days box");
        Assert.assertEquals(actual,expexted);
        extentLogger.pass("Passed:  You can't type negative number in days box");

    }

    @Test
    public void typeInDaysBox_N2() throws InterruptedException {

        LoginPage loginPage= new LoginPage();
        CRMpage crMpage= new CRMpage();
        extentLogger = report.createTest("Create button test on Activity Type page");
        extentLogger.info("Selecting BriteErpDemo button");
        loginPage.BriteErpDemo_button.click();
        extentLogger.info("Entering CRM_Maneger email address");
        loginPage.email.sendKeys("EventsCRM_Manager@info.com");
        extentLogger.info("Entering CRM_Maneger password");
        loginPage.password.sendKeys("Ugh45wQ12");
        extentLogger.info("Clicking on login button");
        loginPage.login.click();
        extentLogger.info("Clicking on CRM module");
        crMpage.crmButtn.click();
        extentLogger.info("Clicking on ActivityTypes functionality");
        pages.crmPage().activityTypes.click();
        extentLogger.info("Click on Create button");
        pages.activityTypesPage().create.click();
        extentLogger.info("Click in days box");
        pages.activityTypesPage().daysBox.click();
        extentLogger.info("Type one in the days box");
        pages.activityTypesPage().daysBox.sendKeys("one");
        String expexted= "0";
        wait(10);
        String actual = pages.activityTypesPage().daysBox.getAttribute("value");
        extentLogger.info("Verify that you can't type any character other than number in days box");
        Assert.assertEquals(actual,expexted);
        extentLogger.pass("Passed:  you can't type any character other than number in days box");

    }


    @Test
    public void defaultValueInSummaryBox() throws InterruptedException {

        LoginPage loginPage= new LoginPage();
        CRMpage crMpage= new CRMpage();
        extentLogger = report.createTest("Create button test on Activity Type page");
        extentLogger.info("Selecting BriteErpDemo button");
        loginPage.BriteErpDemo_button.click();
        extentLogger.info("Entering CRM_Maneger email address");
        loginPage.email.sendKeys("EventsCRM_Manager@info.com");
        extentLogger.info("Entering CRM_Maneger password");
        loginPage.password.sendKeys("Ugh45wQ12");
        extentLogger.info("Clicking on login button");
        loginPage.login.click();
        extentLogger.info("Clicking on CRM module");
        crMpage.crmButtn.click();
        extentLogger.info("Clicking on ActivityTypes functionality");
        pages.crmPage().activityTypes.click();
        extentLogger.info("Click on Create button");
        pages.activityTypesPage().create.click();
        extentLogger.info("Verify the default value is empty in summary box");
        Assert.assertEquals(pages.activityTypesPage().summaryBox.getAttribute("value"),"");
        extentLogger.pass("Passed: the default value is empty in days box");
    }

    @Test
    public void typeInSummaryBox() throws InterruptedException {

        LoginPage loginPage= new LoginPage();
        CRMpage crMpage= new CRMpage();
        extentLogger = report.createTest("Create button test on Activity Type page");
        extentLogger.info("Selecting BriteErpDemo button");
        loginPage.BriteErpDemo_button.click();
        extentLogger.info("Entering CRM_Maneger email address");
        loginPage.email.sendKeys("EventsCRM_Manager@info.com");
        extentLogger.info("Entering CRM_Maneger password");
        loginPage.password.sendKeys("Ugh45wQ12");
        extentLogger.info("Clicking on login button");
        loginPage.login.click();
        extentLogger.info("Clicking on CRM module");
        crMpage.crmButtn.click();
        extentLogger.info("Clicking on ActivityTypes functionality");
        pages.crmPage().activityTypes.click();
        extentLogger.info("Click on Create button");
        pages.activityTypesPage().create.click();
        extentLogger.info("Click in days box");
        pages.activityTypesPage().summaryBox.click();
        extentLogger.info("Type CRM Manager in the sumary box");
        pages.activityTypesPage().summaryBox.sendKeys("CRM Manager");
        String expexted= "CRM Manager";
        wait(10);
        String actual = pages.activityTypesPage().summaryBox.getAttribute("value");
        Assert.assertEquals(actual,expexted);
        extentLogger.pass("Passed:  You can type in summary box");

    }

    @Test
    public void typeInSearchBox() throws InterruptedException {

        LoginPage loginPage= new LoginPage();
        CRMpage crMpage= new CRMpage();
        extentLogger = report.createTest("Create button test on Activity Type page");
        extentLogger.info("Selecting BriteErpDemo button");
        loginPage.BriteErpDemo_button.click();
        extentLogger.info("Entering CRM_Maneger email address");
        loginPage.email.sendKeys("EventsCRM_Manager@info.com");
        extentLogger.info("Entering CRM_Maneger password");
        loginPage.password.sendKeys("Ugh45wQ12");
        extentLogger.info("Clicking on login button");
        loginPage.login.click();
        extentLogger.info("Clicking on CRM module");
        crMpage.crmButtn.click();
        extentLogger.info("Clicking on ActivityTypes functionality");
        pages.crmPage().activityTypes.click();
        extentLogger.info("Type Manager in the search box");
        wait(5);
        pages.activityTypesPage().searchBox.sendKeys("Manager");
        String expexted= "Manager";
        wait(10);
        String actual = pages.activityTypesPage().searchBoxText.getText();
        Assert.assertEquals(actual,expexted);
        extentLogger.pass("Passed:  You can type in search box");

    }

    @Test
    public void continuesSearch() throws InterruptedException {

        LoginPage loginPage= new LoginPage();
        CRMpage crMpage= new CRMpage();
        extentLogger = report.createTest("Create button test on Activity Type page");
        extentLogger.info("Selecting BriteErpDemo button");
        loginPage.BriteErpDemo_button.click();
        extentLogger.info("Entering CRM_Maneger email address");
        loginPage.email.sendKeys("EventsCRM_Manager@info.com");
        extentLogger.info("Entering CRM_Maneger password");
        loginPage.password.sendKeys("Ugh45wQ12");
        extentLogger.info("Clicking on login button");
        loginPage.login.click();
        extentLogger.info("Clicking on CRM module");
        crMpage.crmButtn.click();
        extentLogger.info("Clicking on ActivityTypes functionality");
        pages.crmPage().activityTypes.click();
        extentLogger.info("Click on search box on upper right side");
        pages.activityTypesPage().searchBox.click();
        extentLogger.info("Type Manager in the search box and press enter");
        wait(10);
        pages.activityTypesPage().searchBox.sendKeys("Manager"+ Keys.ENTER);

        extentLogger.info("Then type Test001 in the search box and press enter one more time");
        wait(10);
        pages.activityTypesPage().searchBox.sendKeys("Test001"+ Keys.ENTER);
        String expexted= "Manager or Test001 ";
        wait(10);
        String actaul="";
        for (WebElement el: pages.activityTypesPage().multiSearch){
        actaul+=el.getText()+" ";}
        Assert.assertEquals(actaul,expexted);
        extentLogger.pass("Passed:  You can search continuosly");

    }
}