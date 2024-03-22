import org.junit.jupiter.api.BeforeAll;

import com.group16.FileDatabase;

public class FileDatabaseAccessTest extends AbstractDatabaseTest{
    public FileDatabaseAccessTest() {
        db = new FileDatabase("test.db");
    }

    
    
}
