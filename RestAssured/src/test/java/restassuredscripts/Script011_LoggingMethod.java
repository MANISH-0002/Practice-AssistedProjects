package restassuredscripts;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class Script011_LoggingMethod {
	
	
	@Test
	public void LoggingRestAssured() {
		
		String PMapikey = "PMAK-6577e43c4edcbb0a55f87966-3a90d10ae990b22267766989e6c9f0098e";
		
		given().baseUri("https://api.postman.com")
		.basePath("/workspaces")
		.header("x-api-key", PMapikey)
		.when().get()
		.then().log().all();
		//.then().log().headers();
		//.then().log().ifError();
		//.then().statusCode(200).log().cookies();
		
		
	}

}