
import com.group16.GreenCardData;
import com.group16.WorkflowObject;
import com.group16.WorkflowStatus;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class WorkFlowObjectTest {

    WorkflowObject workflowObject;

    @BeforeEach
    public void setup() {
        workflowObject = new WorkflowObject();
    }

    @Test
    void TestObjectID(){
        assertEquals(workflowObject.getObjectID(), null);

    }

    @Test
    void TestWorkFlowObjectGreenCardFormData(){
        GreenCardData gcData = new GreenCardData();
        gcData.setName("Alice Jones");
        LocalDate DOB = LocalDate.of(2000, 4, 20);
        gcData.setDateOfBirth(DOB);
        gcData.setAddress("45 Wallaby Way");
        workflowObject.setGreenCardData(gcData);
        assertEquals(workflowObject.getFormData(), gcData);
    }

    @Test
    void TestWorkFlowStatus(){

        workflowObject.setWorkflowStatus(WorkflowStatus.APPROVAL);
        assertEquals(workflowObject.getWorkflowStatus(), WorkflowStatus.APPROVAL);

    }

    @Test
    void TestFailSetWFStatus(){
        workflowObject.setWorkflowStatus(null);
        fail("Status must be APPROVED, COMPLETED, OR REVIEWER");
    }
}
