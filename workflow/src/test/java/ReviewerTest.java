import com.group16.Reviewer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReviewerTest {

    @Test
    void ReviewerValidate(){

        Reviewer reviewer = new Reviewer();
        assertEquals(reviewer.Validate("Name"), true);

    }

}
