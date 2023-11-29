package com.app.junitDemo;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

//@Disabled("Functionality is not working,ignoring the test")
public class DisabledTests {

	@Test
	public void method1() {
		System.out.println("Executing Method1");
	}

	@Test
	@Disabled
	public void method2() {
		System.out.println("Executing Method2");
	}

	@Test
	@Disabled
	public void method3() {
		System.out.println("Executing Method3");
	}

	@Test
	public void method4() {
		System.out.println("Executing Method4");
	}

}
