package com.app.junitDemo;

import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

public class DyanamicTestPalindrome {

	@TestFactory

	public Stream<DynamicTest> dynamicTestforPalindrome() {
		return Stream.of("pop", "dad", "mom", "madam").map(inputText -> DynamicTest.dynamicTest(inputText,
				() -> Assertions.assertTrue(Myutils.isPalindrome(inputText))));

	}

}
