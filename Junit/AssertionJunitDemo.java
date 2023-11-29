package com.app.junitDemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertionJunitDemo {
	@Test
	public void testAssertion() {

		String expected = new String("abc");
		String actual = new String("abc");

		String str1 = "junit";
		String str2 = null;

		String s1 = "mani";
		String s2 = "mani";

		int v1 = 10;
		int v2 = 20;

		// Assertions.assertTrue(v1<v2);

		String[] array1 = { "one", "two" };
		String[] array2 = { "one", "two" };
		Assertions.assertArrayEquals(array1, array2);

		// Assertions.assertEquals(expected, actual);
		// Assertions.assertNotNull(str2);
		// Assertions.assertNull(str2);
		// Assertions.assertSame(s1, s2);

		// Assertions.assertNotSame(s1, s2);
	}

}
