package com.giri.junitjenkins;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;



import junit.framework.TestCase;

 class CompareTest extends TestCase {

	@Test
	void testCompareString() {
		assertTrue(Compare.compareString("kee", "kee"));
	}
	@Test
	void testCompareString1() {
		assertFalse(Compare.compareString("Keer", "kee"));
	}
}
