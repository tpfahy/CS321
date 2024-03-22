package com.group16;

public class WorkFlow {
    private int wfid;
    private String step; 
    private int objid;

    public Boolean addWFItem(String step, int objid) {
        return false;
    }

    public int getNextWFItem(String step) {
        return this.objid++;
    }

    public int countWFItems(String step) {
        return 0;     
    }

    public int getWfid(){
        return wfid;
    }
}
