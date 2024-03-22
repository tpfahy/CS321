package com.group16;


import java.time.LocalDate;

public class WorkflowObject {

    private String objectID;
    private GreenCardData data;
    private LocalDate dateCreated;
    private LocalDate dateModied;
    private WorkflowStatus workflowStatus;



    public String getObjectID(){
        return this.objectID;
    }

    public GreenCardData getFormData(){
        return this.data;
    }

    public WorkflowStatus getWorkflowStatus(){
        return this.workflowStatus;
    }

    public void setWorkflowStatus(WorkflowStatus workflowStatus) {
        this.workflowStatus = workflowStatus;
    }

    public void setGreenCardData(GreenCardData data){
        this.data = data;
    }
}
