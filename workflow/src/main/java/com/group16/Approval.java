package com.group16;

public class Approval {
    private WorkFlow currentWF;



    public WorkFlow getNextItem(){

        return null;
    }

    public WorkFlow getCurrentWorkFlow(){
        return this.currentWF;
    }

    public void setCurrentWF(WorkFlow wf){
        this.currentWF = wf;
    }

    public boolean Review(WorkFlow wf){
        return false;
    }

    public void sendToReviewer(WorkFlow wf){
        // send to reviewer
    }

}
