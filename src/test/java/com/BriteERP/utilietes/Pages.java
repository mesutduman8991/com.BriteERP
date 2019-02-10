package com.BriteERP.utilietes;

import com.BriteERP.pages.*;


public class Pages {

    private LoginPage loginPage;
    private CRMpage crmPage;
    private ActivityTypesPage activityTypesPage;
    private PipelinePage pipelinePage;
    private ActivitiesPage activitiesPage;

    private SalesChannelsPage salesChannelsPage;

    private Quotations quotationsPage;
    private Leads_And_OpportunitiesPage leads_and_opportunitiesPage;

    public  ActivityTypesPage activityTypesPage() {
        if (activityTypesPage == null){
            activityTypesPage = new ActivityTypesPage();

        }
        return activityTypesPage;

    }

    public LoginPage loginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }

    public CRMpage crmPage(){
        if(crmPage == null){

            crmPage = new CRMpage();
        }
        return crmPage;
    }

    public Quotations quotationsPage(){
        if(quotationsPage == null){
           quotationsPage = new Quotations();
        }
        return quotationsPage;
    }

    public PipelinePage pipelinePage(){
        if(pipelinePage == null){
            pipelinePage = new PipelinePage();
        }
        return pipelinePage;

    }
    public  ActivitiesPage activitiesPage() {
        if (activitiesPage == null){
            activitiesPage = new ActivitiesPage();

        }
        return activitiesPage;

    }

    public SalesChannelsPage salesChannelsPage(){
        if(salesChannelsPage==null){
            salesChannelsPage= new SalesChannelsPage();
        }
        return salesChannelsPage;
    }

    public Leads_And_OpportunitiesPage leads_and_opportunitiesPage(){
        if (leads_and_opportunitiesPage == null){
            leads_and_opportunitiesPage = new Leads_And_OpportunitiesPage();
        }
        return leads_and_opportunitiesPage;
    }

}
