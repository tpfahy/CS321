public class WorkFlow {
    private int wfid;
    private String step; 
    private int objid;
    
    
    public boolean addWFItem(String step, int objid) {
        return true;
    }

    public int getNextWFItem(String step) {
        // this.objid++;
        return 3; 
    }

    public countWFItems(String step) {
        return 0;     
    }
}
