package com.group16;

public class Approval {
    private WorkFlow currentWF;

    public Approval(){

    }

    public WorkFlow getNextItem(){

        return null;
    }

    public WorkFlow getCurrentWorkFlow(){
        return this.currentWF;
    }

    public void setCurrentWF(WorkFlow wf){
        this.currentWF = wf;
    }

    public boolean review(WorkFlow wf){
        return false;
    }

    public boolean sendToReviewer(WorkFlow wf){
        // send to reviewer
        // return true if successful
        // return false if there is an error
        return true;
    }

}
