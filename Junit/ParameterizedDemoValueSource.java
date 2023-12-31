package com.app.junitDemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.platform.commons.util.StringUtils;

public class ParameterizedDemoValueSource {

	@ParameterizedTest(name="checkBlanks {arguments}")
	@ValueSource(strings = {"abc","xyz","pqr"})
	@EmptySource
	public void checkBlanks(String value) {
		
		Assertions.assertTrue(StringUtils.isBlank(value));
		System.out.println(value);
	}
	@ParameterizedTest(name="Null Source")
	@NullSource
	public void checkNullSource(String value) {
		Assertions.assertTrue(StringUtils.isBlank(value));
		System.out.println(value);
	}
	@ParameterizedTest(name = "null and Empty source")
	@NullAndEmptySource
	public void checkNullAndEmptySource(String value) {

		Assertions.assertTrue(StringUtils.isBlank(value));
		System.out.println(value);
	}

	@ParameterizedTest
	@ValueSource(ints = { 11, 12, 9, 8, 7 })
	public void valueSourceDemo(int args) {

		System.out.println("The integer value is : " + args);
	}
}
