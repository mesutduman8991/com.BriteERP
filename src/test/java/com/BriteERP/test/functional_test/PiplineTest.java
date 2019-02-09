package com.BriteERP.test.functional_test;

import com.BriteERP.utilietes.ApplicationConstants;
import com.BriteERP.utilietes.BrowserUtils;
import com.BriteERP.utilietes.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PiplineTest extends TestBase {

    @Test
    public void pieChart(){
        extentLogger = report.createTest("Selecting Pipline Page");
        extentLogger.info("Selecting BriteErpDemo button");
        pages.loginPage().BriteErpDemo_button.click();
        extentLogger.info("Entering CRM_Maneger email address");
        pages.loginPage().email.sendKeys("EventsCRM_Manager@info.com");
        extentLogger.info("Entering CRM_Maneger password");
        pages.loginPage().password.sendKeys("Ugh45wQ12");
        extentLogger.info("Clicking on login button");
        pages.loginPage().login.click();
        extentLogger.info("Clicking on CRM module");
        pages.crmPage().crmButtn.click();
        extentLogger.info("Clicking on Pipeline Page");
        pages.pipelinePage().pipline_button.click();
        extentLogger.info("Clicking on the PIE Chart");
        pages.pipelinePage().pie_Chart.click();
        BrowserUtils.wait(5);
        String actual=pages.pipelinePage().piplinePieChart_Title.getText();
        Assert.assertEquals(actual, ApplicationConstants.Pie_Chart_Title);

    }
    @Test
    public void barlineCharts(){
        extentLogger = report.createTest("Selecting Pipline Page");
        extentLogger.info("Selecting BriteErpDemo button");
        pages.loginPage().BriteErpDemo_button.click();
        extentLogger.info("Entering CRM_Maneger email address");
        pages.loginPage().email.sendKeys("EventsCRM_Manager@info.com");
        extentLogger.info("Entering CRM_Maneger password");
        pages.loginPage().password.sendKeys("Ugh45wQ12");
        extentLogger.info("Clicking on login button");
        pages.loginPage().login.click();
        extentLogger.info("Clicking on CRM module");
        pages.crmPage().crmButtn.click();
        extentLogger.info("Clicking on Pipeline Page");
        pages.pipelinePage().pipline_button.click();
        extentLogger.info("Clicking on the Line Chart");
        pages.pipelinePage().line_Chart.click();

        String actual=pages.pipelinePage().piplinePieChart_Title.getText();
        Assert.assertEquals(actual, ApplicationConstants.Pie_Chart_Title);

    }

    @Test
    public void delay2Assign(){
        extentLogger = report.createTest("Selecting Pipline Page");
        extentLogger.info("Selecting BriteErpDemo button");
        pages.loginPage().BriteErpDemo_button.click();
        extentLogger.info("Entering CRM_Maneger email address");
        pages.loginPage().email.sendKeys("EventsCRM_Manager@info.com");
        extentLogger.info("Entering CRM_Maneger password");
        pages.loginPage().password.sendKeys("Ugh45wQ12");
        extentLogger.info("Clicking on login button");
        pages.loginPage().login.click();
        extentLogger.info("Clicking on CRM module");
        pages.crmPage().crmButtn.click();
        BrowserUtils.wait(15);
        extentLogger.info("Clicking on Pipeline Page");
        pages.pipelinePage().pipline_button.click();
        BrowserUtils.wait(10);
        extentLogger.info("Clicking on the Measures");
        pages.pipelinePage().piplineMeasures.click();
        extentLogger.info("Clicking on the Delay to Assign");
        pages.pipelinePage().piplineDelay2Assign.click();

        String actual=pages.pipelinePage().piplinePieChart_Title.getText();
        Assert.assertEquals(actual, ApplicationConstants.Pie_Chart_Title);

    }

    @Test
    public void delay2Close(){
        extentLogger = report.createTest("Selecting Pipline Page");
        extentLogger.info("Selecting BriteErpDemo button");
        pages.loginPage().BriteErpDemo_button.click();
        extentLogger.info("Entering CRM_Maneger email address");
        pages.loginPage().email.sendKeys("EventsCRM_Manager@info.com");
        extentLogger.info("Entering CRM_Maneger password");
        pages.loginPage().password.sendKeys("Ugh45wQ12");
        extentLogger.info("Clicking on login button");
        pages.loginPage().login.click();
        extentLogger.info("Clicking on CRM module");
        pages.crmPage().crmButtn.click();
        BrowserUtils.wait(10);
        extentLogger.info("Clicking on Pipeline Page");
        pages.pipelinePage().pipline_button.click();
        BrowserUtils.wait(10);
        extentLogger.info("Clicking on the Measures");
        pages.pipelinePage().piplineMeasures.click();
        extentLogger.info("Clicking on the Delay to Close");
        pages.pipelinePage().piplineDelay2Close.click();

        String actual=pages.pipelinePage().piplinePieChart_Title.getText();
        Assert.assertEquals(actual, ApplicationConstants.Pie_Chart_Title);

    }

    @Test
    public void overpaasedDeadline(){
        extentLogger = report.createTest("Selecting Pipline Page");
        extentLogger.info("Selecting BriteErpDemo button");
        pages.loginPage().BriteErpDemo_button.click();
        extentLogger.info("Entering CRM_Maneger email address");
        pages.loginPage().email.sendKeys("EventsCRM_Manager@info.com");
        extentLogger.info("Entering CRM_Maneger password");
        pages.loginPage().password.sendKeys("Ugh45wQ12");
        extentLogger.info("Clicking on login button");
        pages.loginPage().login.click();
        extentLogger.info("Clicking on CRM module");
        pages.crmPage().crmButtn.click();
        BrowserUtils.wait(10);
        extentLogger.info("Clicking on Pipeline Page");
        pages.pipelinePage().pipline_button.click();
        BrowserUtils.wait(10);
        extentLogger.info("Clicking on the Measures");
        pages.pipelinePage().piplineMeasures.click();
        extentLogger.info("Clicking on the Overpassed Deadline");
        pages.pipelinePage().piplineOverpassedDeadline.click();

        String actual=pages.pipelinePage().piplinePieChart_Title.getText();
        Assert.assertEquals(actual, ApplicationConstants.Pie_Chart_Title);
    }

    @Test
    public void ofActivities(){
        extentLogger = report.createTest("Selecting Pipline Page");
        extentLogger.info("Selecting BriteErpDemo button");
        pages.loginPage().BriteErpDemo_button.click();
        extentLogger.info("Entering CRM_Maneger email address");
        pages.loginPage().email.sendKeys("EventsCRM_Manager@info.com");
        extentLogger.info("Entering CRM_Maneger password");
        pages.loginPage().password.sendKeys("Ugh45wQ12");
        extentLogger.info("Clicking on login button");
        pages.loginPage().login.click();
        extentLogger.info("Clicking on CRM module");
        pages.crmPage().crmButtn.click();
        BrowserUtils.wait(10);
        extentLogger.info("Clicking on Pipeline Page");
        pages.pipelinePage().pipline_button.click();
        BrowserUtils.wait(10);
        extentLogger.info("Clicking on the Measures");
        pages.pipelinePage().piplineMeasures.click();
        extentLogger.info("Clicking on the # of Activities");
        pages.pipelinePage().piplineOfActivities.click();

        String actual=pages.pipelinePage().piplinePieChart_Title.getText();
        Assert.assertEquals(actual, ApplicationConstants.Pie_Chart_Title);

    }

    @Test
    public void probability(){
        extentLogger = report.createTest("Selecting Pipline Page");
        extentLogger.info("Selecting BriteErpDemo button");
        pages.loginPage().BriteErpDemo_button.click();
        extentLogger.info("Entering CRM_Maneger email address");
        pages.loginPage().email.sendKeys("EventsCRM_Manager@info.com");
        extentLogger.info("Entering CRM_Maneger password");
        pages.loginPage().password.sendKeys("Ugh45wQ12");
        extentLogger.info("Clicking on login button");
        pages.loginPage().login.click();
        extentLogger.info("Clicking on CRM module");
        pages.crmPage().crmButtn.click();
        BrowserUtils.wait(10);
        extentLogger.info("Clicking on Pipeline Page");
        pages.pipelinePage().pipline_button.click();
        BrowserUtils.wait(10);
        extentLogger.info("Clicking on the Measures");
        pages.pipelinePage().piplineMeasures.click();
        extentLogger.info("Clicking on the Probability");
        pages.pipelinePage().piplineProbablity.click();

        String actual=pages.pipelinePage().piplinePieChart_Title.getText();
        Assert.assertEquals(actual, ApplicationConstants.Pie_Chart_Title);

    }

    @Test
    public void totalRevenue(){
        extentLogger = report.createTest("Selecting Pipline Page");
        extentLogger.info("Selecting BriteErpDemo button");
        pages.loginPage().BriteErpDemo_button.click();
        extentLogger.info("Entering CRM_Maneger email address");
        pages.loginPage().email.sendKeys("EventsCRM_Manager@info.com");
        extentLogger.info("Entering CRM_Maneger password");
        pages.loginPage().password.sendKeys("Ugh45wQ12");
        extentLogger.info("Clicking on login button");
        pages.loginPage().login.click();
        extentLogger.info("Clicking on CRM module");
        pages.crmPage().crmButtn.click();
        BrowserUtils.wait(10);
        extentLogger.info("Clicking on Pipeline Page");
        pages.pipelinePage().pipline_button.click();
        BrowserUtils.wait(10);
        extentLogger.info("Clicking on the Measures");
        pages.pipelinePage().piplineMeasures.click();
        extentLogger.info("Clicking on the Total Revenue");
        pages.pipelinePage().piplineTotalRevenue.click();

        String actual=pages.pipelinePage().piplinePieChart_Title.getText();
        Assert.assertEquals(actual, ApplicationConstants.Pie_Chart_Title);
    }

    @Test
    public void count(){
        extentLogger = report.createTest("Selecting Pipline Page");
        extentLogger.info("Selecting BriteErpDemo button");
        pages.loginPage().BriteErpDemo_button.click();
        extentLogger.info("Entering CRM_Maneger email address");
        pages.loginPage().email.sendKeys("EventsCRM_Manager@info.com");
        extentLogger.info("Entering CRM_Maneger password");
        pages.loginPage().password.sendKeys("Ugh45wQ12");
        extentLogger.info("Clicking on login button");
        pages.loginPage().login.click();
        extentLogger.info("Clicking on CRM module");
        pages.crmPage().crmButtn.click();
        BrowserUtils.wait(10);
        extentLogger.info("Clicking on Pipeline Page");
        pages.pipelinePage().pipline_button.click();
        BrowserUtils.wait(10);
        extentLogger.info("Clicking on the Measures");
        pages.pipelinePage().piplineMeasures.click();
        extentLogger.info("Clicking on the Total Revenue");
        pages.pipelinePage().piplineCount.click();

        String actual=pages.pipelinePage().piplinePieChart_Title.getText();
        Assert.assertEquals(actual, ApplicationConstants.Pie_Chart_Title);

    }

}
