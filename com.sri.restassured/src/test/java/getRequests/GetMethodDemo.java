package getRequests;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetMethodDemo {

	@Test
	public void getAPICalls()
	{
		String applicationURI="https://api.openweathermap.org/data/2.5/weather?lat=44.34&lon=10.99&appid=2188e9f67b256d74ff8dd89c818b7043";
		Response resp = RestAssured.get(applicationURI);
		int statusCode = resp.getStatusCode();
		String statusMessage = resp.getStatusLine();
		System.out.println("Response Code:"+statusCode+" Response Status Line:"+statusMessage);		
	}
}
