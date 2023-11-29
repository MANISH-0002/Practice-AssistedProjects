package com.app.junitDemo;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class RepeatedTestDemo {
	
	@RepeatedTest(2)
	@DisplayName("Repeated Test Methods")
	public void repeatmessage() {
		System.out.println("Repeating..");
	}

	@Test
	public void AssumptionDemo() {
		boolean isDBServerup=true;
		Assumptions.assumeTrue(isDBServerup,"DbServer");
		System.out.println("proceed");
	}
}
