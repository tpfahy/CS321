import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.group16.Database;
import com.group16.WorkflowObject;

public abstract class AbstractDatabaseTest {
    protected Database db;


    @BeforeEach
    public void setup() {
        db.connect();
    }

    @AfterEach
    public void teardown() {
        db.disconnect();
    }

    @Test
    public void testInsert() {
        try {
            db.insert(new WorkflowObject());
        } catch (Exception e) {
            fail("insert should not throw exception");
        }
    }

    @Test
    public void testUpdate() {
        try {
            db.update(new WorkflowObject());
        } catch (Exception e) {
            fail("update should not throw exception");
        }
    }

    @Test
    public void testDelete() {
        try {
            db.delete(1);
        } catch (Exception e) {
            fail("delete should not throw exception");
        }
    }

    @Test
    public void testSelect() {
        try {
            db.select((WorkflowObject obj) -> true);
        } catch (Exception e) {
            fail("select should not throw exception");
        }
    }

}
