package com.group16;

public class Approval {
    private WorkFlow currentWF; // current workflow for approval

    public Approval(){

    }

    public WorkFlow getNextItem(){
        // gets the next Approval item in the workflow

        return null;
    }

    // returns the current workflow of the Approver
    public WorkFlow getCurrentWorkFlow(){
        return this.currentWF;
    }

    // sets the current workflow for approval
    public void setCurrentWF(WorkFlow wf){
        this.currentWF = wf;
    }

    // reviews the current workflow to validate it
    // return true if valid, return false if not valid
    public boolean review(WorkFlow wf){
        return false;
    }

    // sends workflow to reviewer
    // returns false if unsuccessful, returns true if successful
    public boolean sendToReviewer(WorkFlow wf){
        // send to reviewer
        // return true if successful
        // return false if there is an error
        return true;
    }

}
