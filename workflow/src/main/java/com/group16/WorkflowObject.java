package com.group16;


import java.time.LocalDate;

public class WorkflowObject {

    private String objectID;
    private GreenCardData data;
    private LocalDate dateCreated;
    private LocalDate dateModified;
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
    public LocalDate getDateCreated() {
        return dateCreated;
    }
    public LocalDate getDateModified() {
        return dateModified;
    }

    public void setWorkflowStatus(WorkflowStatus workflowStatus) {
        this.workflowStatus = workflowStatus;
    }

    public void setGreenCardData(GreenCardData data){
        this.data = data;
    }

    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }

    public void setDateModified(LocalDate dateModified) {
        this.dateModified = dateModified;
    }
}
