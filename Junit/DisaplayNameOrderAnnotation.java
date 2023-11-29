package com.app.junitDemo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//@TestMethodOrder(MethodOrderer.Random.class)
public class DisaplayNameOrderAnnotation {

	@Order(3)
	@DisplayName("3. Test sign in Button")
	@Test
	public void method1() {
		System.out.println("Click on Sign In Button");

	}

	@Order(1)
	@DisplayName("1. TestUsername field")
	@Test
	public void method2() {
		System.out.println("Enter the username");

	}

	@Order(4)
	@DisplayName("4. Test Forgot Password field")
	@Test
	public void method3() {
		System.out.println("Enter the username in forgot password");

	}

	@Order(2)
	@DisplayName("2. Test Password field")
	@Test
	public void method4() {
		System.out.println("Enter the password");

	}

}
