import com.group16.Approval;
import com.group16.WorkFlow;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApprovalTest {
    // Approval test cases for the approval class

    @Test
    void TestSetWF(){
        // tests that setting and getting the workflow works
        WorkFlow wf = new WorkFlow();
        Approval approver = new Approval();

        approver.setCurrentWF(wf);
        assertEquals(approver.getCurrentWorkFlow(), wf);
    }

    @Test
    void TestReview(){
        // reviewer is currently hardcoded to return false for the tests
        WorkFlow wf = new WorkFlow();
        Approval approver = new Approval();
        assertEquals(approver.review(wf), false);

    }

    @Test
    void TestSendToUser(){
        // send to reviewer is currently hardcoded to return false for testing
        WorkFlow wf = new WorkFlow();
        Approval approver = new Approval();
        assertEquals(approver.sendToUser(wf), true);
    }

    @Test
    void TestGetNextItem(){
        // get next iterm is hard coded to return null for testing
        Approval approver = new Approval();
        assertEquals(approver.getNextItem(), null);
    }


}
