package name.valery1707.wercker.demo;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class DemoTest {

	@Test
	public void testTotalMemory() {
		assertTrue("totalMemory > 0", Demo.totalMemory() > 0);
	}
}
