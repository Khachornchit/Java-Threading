package net.putfirstthingsfirst.thread.tests;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import net.putfirstthingsfirst.thread.*;

public class AppTest {
	@Test
	public void testAppHasAGreeting() {
		Greeting classUnderTest = new Greeting();
		assertNotNull("app should have a greeting", classUnderTest.toString());
	}
}
