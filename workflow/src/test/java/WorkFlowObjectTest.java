
import com.group16.GreenCardFormData;
import com.group16.WorkflowObject;
import com.group16.WorkflowStatus;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class WorkFlowObjectTest {
    // Testing for Workflow Object
    WorkflowObject workflowObject;

    @BeforeEach
    public void setup() {
        workflowObject = new WorkflowObject();
    }

    @Test
    void TestObjectID(){
        assertEquals(workflowObject.getObjectID(), null);
        // tests that calling .getObjectID() will return the expected result
    }

    @Test
    void TestWorkFlowObjectGreenCardFormData(){
        GreenCardFormData gcData = new GreenCardFormData();
        gcData.setName("Alice Jones");
        LocalDate DOB = LocalDate.of(2000, 4, 20);
        gcData.setDateOfBirth(DOB);
        gcData.setAddress("45 Wallaby Way");
        workflowObject.setGreenCardData(gcData);
        assertEquals(workflowObject.getFormData(), gcData);
        // verifies that get form data will return the correct green card data
    }

    @Test
    void TestWorkFlowStatus(){

        workflowObject.setWorkflowStatus(WorkflowStatus.APPROVAL);
        assertEquals(workflowObject.getWorkflowStatus(), WorkflowStatus.APPROVAL);
        // tests that the correct workflow status is returned
    }

    @Test
    void TestFailSetWFStatus(){
        workflowObject.setWorkflowStatus(null);
        fail("Status must be APPROVED, COMPLETED, OR REVIEWER");
        // generic fail test case to have cases that both
    }
}
