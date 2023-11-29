package com.app.junitDemo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class beforeAfterEachAnnotation {

	@BeforeEach
	public void init() {

		System.out.println("Start the DB Connection");

		System.out.println("Initaliztion Done..Setup");
	}

	@AfterEach
	public void tearDown() {

		System.out.println("Close DB Connection..TearDown");
	}

	@Test
	public void test1() {
		System.out.println("Execution of test method1");
	}

	@Test
	public void test2() {
		System.out.println("Execution of test method2");
	}

}
