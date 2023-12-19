package restassuredscripts;

import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Script008HamcrestValidateMethods {
	
	// Hamcrest dependency has been added to your POM file
	// This dependency provides us many validation methods that help us to validate the response code
	
	// equalTo() Hamcrest method
	
	@Test(priority='1')
	public void ValidateResponseBody() {
		
		String PMapikey="PMAK-6577e43c4edcbb0a55f87966-3a90d10ae990b22267766989e6c9f0098e";
		
		given().baseUri("https://api.postman.com")
		.basePath("/workspaces")
		.header("x-api-key",PMapikey )
		.when().get()
		.then().statusCode(200)
		//fetch the resonse body and validate if response includes correct values or not
		
		.body("workspaces[1].id", equalTo("ae03ee04-5e01-4668-a74d-c133020ee48b"),
				"workspaces[1].name", equalTo("Phase3_Postman"),
				"workspaces[1].type", equalTo("personal"));
			  	
	}
	
	@Test(priority='2')
	public void ValidateResponseBody_equalTo() {
		
		
		given().baseUri("https://petstore.swagger.io")
		.basePath("/v2/user/dhabolemanish")
		.when().get()
		.then().statusCode(200)
		//fetch the response body and validate if response includes correct values or not
		
		.body("username", equalTo("dhabolemanish"),
			 ("firstName"),equalTo("manish"),
			 ("lastName"),equalTo("dhabole"),
			 ("email"),equalTo("dhabole1@gmail.com"),
			 ("userStatus"),equalTo(1));
			 
			 		
	}
	@Test(priority='3')
	public void ValidateResponseBody_hasItems() {
		
	String PMapikey="PMAK-6577e43c4edcbb0a55f87966-3a90d10ae990b22267766989e6c9f0098e";
		
		given().baseUri("https://api.postman.com")
		.basePath("/workspaces")
		.header("x-api-key",PMapikey )
		.when().get()
		.then().statusCode(200)
		// fetch the response body and validate if response includes correct values or not
		
		.body("workspaces.name", hasItems("My Workspace", "Workspace-2"),
			 "workspaces.type", hasItems("personal"));
		
		
	}
	
	

}