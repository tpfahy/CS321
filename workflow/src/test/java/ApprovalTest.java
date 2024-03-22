import com.group16.Approval;
import com.group16.WorkFlow;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApprovalTest {

    @Test
    void TestSetWF(){
        WorkFlow wf = new WorkFlow();
        Approval approver = new Approval();

        approver.setCurrentWF(wf);
        assertEquals(approver.getCurrentWorkFlow(), wf);
    }

    @Test
    void TestReview(){
        WorkFlow wf = new WorkFlow();
        Approval approver = new Approval();
        assertEquals(approver.review(wf), false);

    }

    @Test
    void TestSendToReviewer(){
        WorkFlow wf = new WorkFlow();
        Approval approver = new Approval();
        assertEquals(approver.sendToReviewer(wf), true);
    }

    @Test
    void TestGetNextItem(){
        // WorkFlow wf = new WorkFlow();
        Approval approver = new Approval();
        assertEquals(approver.getNextItem(), null);
    }


}
