package com.giri.junitjenkins;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CompareTest {

	@Test
	void test() {
		assertEquals(true, Compare.compareString("giri", "giri"));
	}

}
