import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.Date;

import com.group16.GreenCardData;

public class GreenCardDataTest {
    GreenCardData greenCardData;

    @BeforeEach
    public void setup() {
        greenCardData = new GreenCardData();
    }

    
    @Test
    public void setNormalName_success() {
        greenCardData.setName("John Doe");
        assertEquals("John Doe", greenCardData.getName());
    }

    @Test
    public void setNullName_shouldThrowException() {
        try {
            greenCardData.setName(null);
            fail("setName should throw exception");
        } catch (IllegalArgumentException e) {
            assertEquals("Name cannot be null", e.getMessage());
        }
    }

    @Test
    public void setNormalDateOfBirth_success() {
        LocalDate date = LocalDate.of(2, 2, 2003);
        
        greenCardData.setDateOfBirth(date);
        assertEquals(date, greenCardData.getDateOfBirth());
    }
}
