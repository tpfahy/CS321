public class WorkFlow {
    private int wfid;
    private String step; 
    private int objid;
    
    
    public Boolean addWFItem(String step, int objid) {
        return false;
    }

    public int getNextWFItem(String step) {
        // this.objid++;
        return 2; 
    }

    public countWFItems(String step) {
        return 3;     
    }
}
