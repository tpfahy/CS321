import com.group16.Reviewer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReviewerTest {

    @Test
    void ReviewerValidate(){
        // basic test for reviewer to make sure validation would return true

        Reviewer reviewer = new Reviewer();
        assertEquals(reviewer.Validate("Name"), true);

    }

}
