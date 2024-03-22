import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import com.group16.FileDatabase;

public class FileDatabaseConnectionTest {
    @Test
    public void testConnect() {
        FileDatabase db = new FileDatabase("test.db");
        try {
            db.connect();
        } catch (Exception e) {
            fail("connect should not throw exception");
        }
    }

    @Test
    public void testDisconnect() {
        FileDatabase db = new FileDatabase("test.db");
        try {
            db.disconnect();
        } catch (Exception e) {
            fail("disconnect should not throw exception");
        }
    }

    @Test
    public void testConnect_noFile_shouldThrowException() {
        FileDatabase db = new FileDatabase("nonexistent.db");
        try {
            db.connect();
            fail("connect should throw exception");
        } catch (Exception e) {
            // expected
        }
    }

    @Test
    public void testDisconnect_neverConncted_shouldThrowException() {
        FileDatabase db = new FileDatabase("nonexistent.db");
        try {
            db.disconnect();
            fail("disconnect should throw exception");
        } catch (Exception e) {
            // expected
        }
    }
}
