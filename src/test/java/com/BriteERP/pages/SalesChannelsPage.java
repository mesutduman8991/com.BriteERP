package com.BriteERP.pages;

import com.BriteERP.utilietes.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SalesChannelsPage {

    public SalesChannelsPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath= "//div[@class='oe_secondary_menu']//ul[2]//li[3]//a[1]//span[1]")
    public WebElement salesChannelsButton;

    @FindBy(xpath= "/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]/span[1]")
    public WebElement pipelineButton;

    @FindBy(xpath= "//button[contains(text(),'Create')]")
    public WebElement createButton;

    @FindBy(xpath = "//span[contains(text(),'Discard')]")
    public WebElement discardButton;

    @FindBy(xpath= "//button[contains(text(),'Import')]")
    public WebElement importButton;

    @FindBy(xpath = "//label[@class='btn btn-primary']")
    public WebElement loadFileButton;












}
