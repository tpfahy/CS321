import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.Month;

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
        LocalDate date = LocalDate.of(2003, Month.FEBRUARY, 1);
        
        greenCardData.setDateOfBirth(date);
        assertEquals(date, greenCardData.getDateOfBirth());
    }

    @Test
    public void setNullDateOfBirth_shouldThrowException() {
        try {
            greenCardData.setDateOfBirth(null);
            fail("setDateOfBirth should throw exception");
        } catch (IllegalArgumentException e) {
            assertEquals("Date of birth cannot be null", e.getMessage());
        }
    }

    @Test
    public void setNormalResidenceSince_success() {
        LocalDate date = LocalDate.of(2003, Month.FEBRUARY, 1);
        
        greenCardData.setResidenceSince(date);
        assertEquals(date, greenCardData.getResidenceSince());
    }

    @Test
    public void setNullResidenceSince_shouldThrowException() {
        try {
            greenCardData.setResidenceSince(null);
            fail("setResidenceSince should throw exception");
        } catch (IllegalArgumentException e) {
            assertEquals("Residence since cannot be null", e.getMessage());
        }
    }

    @Test
    public void setNormalANumber_success() {
        greenCardData.setANumber("123456789");
        assertEquals("123456789", greenCardData.getANumber());
    }

    @Test
    public void setNullANumber_shouldThrowException() {
        try {
            greenCardData.setANumber(null);
            fail("setANumber should throw exception");
        } catch (IllegalArgumentException e) {
            assertEquals("A-Number cannot be null", e.getMessage());
        }
    }
    
    @Test
    public void setNormalSsn_success() {
        greenCardData.setSsn("123456789");
        assertEquals("123456789", greenCardData.getSsn());
    }

    @Test
    public void setNullSsn_shouldThrowException() {
        try {
            greenCardData.setSsn(null);
            fail("setSsn should throw exception");
        } catch (IllegalArgumentException e) {
            assertEquals("SSN cannot be null", e.getMessage());
        }
    }

    @Test
    public void setNormalAddress_success() {
        greenCardData.setAddress("1234 Main St");
        assertEquals("1234 Main St", greenCardData.getAddress());
    }

    @Test
    public void setNullAddress_shouldThrowException() {
        try {
            greenCardData.setAddress(null);
            fail("setAddress should throw exception");
        } catch (IllegalArgumentException e) {
            assertEquals("Address cannot be null", e.getMessage());
        }
    }

    @Test
    public void setNormalGender_success() {
        greenCardData.setGender("M");
        assertEquals("M", greenCardData.getGender());
    }

    @Test
    public void setNullGender_shouldThrowException() {
        try {
            greenCardData.setGender(null);
            fail("setGender should throw exception");
        } catch (IllegalArgumentException e) {
            assertEquals("Gender cannot be null", e.getMessage());
        }
    }
}
