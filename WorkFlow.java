public class WorkFlow {
    private int wfid;
    private String step; 
    private int objid;
    
    
    public boolean addWFItem(String step, int objid) {
        return false;
    }

    public int getNextWFItem(String step) {
        // this.objid++;
        return 99; 
    }

    public int countWFItems(String step) {
        return 0;     
    }
    
    public int check() {
    	return 0;
    }
    
    
}
