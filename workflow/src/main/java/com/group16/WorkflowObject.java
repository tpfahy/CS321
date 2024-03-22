package com.group16;


import java.time.LocalDate;

public class WorkflowObject {

    // String for objectID
    private String objectID;
    // Green card data is stored in Data
    private GreenCardFormData data;
    // The time the object is created
    private LocalDate dateCreated;
    // The time the workflow is modified
    private LocalDate dateModified;
    // The current status of the workflow object
    private WorkflowStatus workflowStatus;



    // returns the current object ID
    public String getObjectID(){
        return this.objectID;
    }

    // returns the green card data
    public GreenCardFormData getFormData(){
        return this.data;
    }

    // returns the current workflow status
    public WorkflowStatus getWorkflowStatus(){
        return this.workflowStatus;
    }

    // returns the date the workflow object was created
    public LocalDate getDateCreated() {
        return dateCreated;
    }

    // returns the date the workflow data was modified
    public LocalDate getDateModified() {
        return dateModified;
    }

    // sets the current workflow status
    public void setWorkflowStatus(WorkflowStatus workflowStatus) {
        this.workflowStatus = workflowStatus;
    }

    // sets the current green card data
    public void setGreenCardData(GreenCardFormData data){
        this.data = data;
    }

    // sets the date the workflow object is created
    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }

    // sets the date the workflow object is modified
    public void setDateModified(LocalDate dateModified) {
        this.dateModified = dateModified;
    }
}
