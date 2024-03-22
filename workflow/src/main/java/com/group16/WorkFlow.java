package com.group16;

public class WorkFlow {
    // integer for the current workflow ID
    private int wfid;
    // current step the workflow is on
    private WorkflowStatus step;
    // object id
    private int objid;

    // harded coded function for add workflow item
    public Boolean addWFItem(String step, int objid) {
        return false;
    }

    // hard coded function for get next workflow item
    public int getNextWFItem(String step) {
        return this.objid++;
    }

    // hard coded function for count workflow items
    public int countWFItems(String step) {
        return 0;     
    }

    // returns the workflow id
    public int getWfid(){
        return wfid;
    }

    // gets the step the workflow status is on
    public WorkflowStatus getStep(){
        return step;
    }

    // sets the step for the workflow status
    public void setStep(WorkflowStatus step){
        this.step = step;
    }

}
