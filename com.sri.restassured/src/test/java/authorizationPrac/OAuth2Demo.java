package authorizationPrac;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class OAuth2Demo 
{
	
	@Test
	public void testOAuth2()
	{
		Response resp = RestAssured.given()
				        .auth()
				        .oauth2("")//access token
				        .post("");
		
		System.out.println("StatusCode:"+resp.statusCode());
		System.out.println("Status Message:"+resp.statusLine());
	}

}
