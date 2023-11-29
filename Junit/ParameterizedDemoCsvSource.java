package com.app.junitDemo;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ParameterizedDemoCsvSource {

	
	@ParameterizedTest(name="CSV Source{arguments}")
	@CsvSource({"Audi,25","BMW,30","Volvo,35","Benz,50"})
	
	
	public void datafrom_CSVsource(String car,String price) {

		System.out.println(car+" :"+price);
		
	}
}


