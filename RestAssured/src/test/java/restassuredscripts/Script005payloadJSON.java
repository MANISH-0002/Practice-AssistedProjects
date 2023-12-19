package restassuredscripts;

import static org.hamcrest.Matchers.equalTo;

import org.json.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Script005payloadJSON {
	
	
@Test
	public void PostUsingJson() {
	
	JSONObject body= new JSONObject();
	body.put("name", "Mani");
	body.put("salary", "20000");
	body.put("age", "23");
	
	int responseid= RestAssured
	.given()
	.baseUri("https://dummy.restapiexample.com/api/v1/create")
	.contentType(ContentType.JSON)
	.body(body.toString())
	.when().post()
	.then().statusCode(200)
	.body("data.name", equalTo("Mani"))
	.extract().path("data.id");
	
	System.out.println(responseid);
	}
    

}
