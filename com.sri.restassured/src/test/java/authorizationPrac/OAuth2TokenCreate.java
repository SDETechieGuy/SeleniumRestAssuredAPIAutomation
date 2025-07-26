package authorizationPrac;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class OAuth2TokenCreate 
{
	
	@Test
	public void createToken()
	{
		
		Response resp = RestAssured.given()
				        .formParam("client_id", "value")
				        .formParam("client_secret","value")
				        .formParam("grant_type","value")
				        .post("URI");
		String jsonString = resp.jsonPath().prettify();//returns json as a String
		String token = resp.jsonPath().get("access_token");
	}

}
