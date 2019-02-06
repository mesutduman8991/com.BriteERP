package com.BriteERP.utilietes;

import com.BriteERP.pages.*;

public class Pages {

    private LoginPage loginPage;
    private CRMpage crmPage;
    private ActivityTypesPage activityTypesPage;
    private PipelinePage pipelinePage;
    private ActivitiesPage activitiesPage;


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

}
