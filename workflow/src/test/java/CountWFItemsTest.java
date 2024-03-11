import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.group16.WorkFlow;

public class CountWFItemsTest {
	@Test
	void CountNewWFItemsTest() {
		WorkFlow wf = new WorkFlow();
		int count = wf.countWFItems("null");
		assertEquals(count, 0);
	}
}
