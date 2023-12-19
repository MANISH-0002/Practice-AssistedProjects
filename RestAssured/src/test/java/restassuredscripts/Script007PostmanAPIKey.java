package restassuredscripts;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;


public class Script007PostmanAPIKey {
	@Test(priority='1')
	public void postmangetReq() {
		
		String PMapikey="PMAK-6577e43c4edcbb0a55f87966-3a90d10ae990b22267766989e6c9f0098e";
		
		given().baseUri("https://api.postman.com").basePath("/workspaces")
		.header("x-api-key",PMapikey).when().get()
		.then().statusCode(200).log().all();
	}
@Test(priority='2')
	public void extract_value_response() {
String PMapikey="PMAK-6577e43c4edcbb0a55f87966-3a90d10ae990b22267766989e6c9f0098e";
		
		String responseoutput=given().baseUri("https://api.postman.com").basePath("/workspaces")
		.header("x-api-key",PMapikey).when().get()
		.then()
		.extract().path("workspaces[1].name");
		
		System.out.println("Workspace Name:"+responseoutput);
		
	}
@Test(priority='3')
 public void extract_response_JSONPath() {
	 String PMapikey="PMAK-6577e43c4edcbb0a55f87966-3a90d10ae990b22267766989e6c9f0098e";
	 Response res =given().baseUri("https://api.postman.com").basePath("/workspaces")
				.header("x-api-key",PMapikey).when().get()
				.then()
				.extract().response();
	 JsonPath json= new JsonPath(res.asString());
	 System.out.println(json.getString("workspaces[1]"));
	 
 }
	
}
