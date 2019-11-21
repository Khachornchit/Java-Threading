package net.putfirstthingsfirst.thread.tests;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
import net.putfirstthingsfirst.thread.*;

public class AppTest {
	@Test
	public void testAppHasAGreeting() {
		Greeting classUnderTest = new Greeting();
		assertNotNull("app should have a greeting", classUnderTest.toString());
	}
}
