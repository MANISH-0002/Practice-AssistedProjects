package restassuredscripts;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.response.Response;


public class Script009GitHubBearerToken {
	@Test(priority='1')
	public void Authorization_bearertoken() {
		
	Response res=given().baseUri("https://api.github.com")
			.basePath("/user/repos")
			.header("Authorization","Bearer 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")
			.when().get()
			.then().statusCode(200)
			.extract().response();
	         res.prettyPrint();
	}
	
	@Test(priority='2')
	public void Authorization_bearertoken_specificRepo() {
		
		Response res=given().baseUri("https://api.github.com")
		.basePath("/repos/MANISH-0002/Sparks-foundation")
		.header("Authorization", "Bearer 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")
		.when().get()
		.then().statusCode(200)
		.extract().response();
		
		res.prettyPrint();
		
				
	}

}
