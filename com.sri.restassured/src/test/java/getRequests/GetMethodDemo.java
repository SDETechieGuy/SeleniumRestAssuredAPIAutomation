package getRequests;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class GetMethodDemo {

	@Test
	public void getAPICalls()
	{
		//String applicationURI="https://api.openweathermap.org/data/2.5/weather?lat=44.34&lon=10.99&appid=2188e9f67b256d74ff8dd89c818b7043";
		String applicationURI="http://localhost:3000/posts";
		Response resp = get(applicationURI);
		int statusCode = resp.getStatusCode();
		String statusMessage = resp.getStatusLine();
		System.out.println("GET CALL Response Code:"+statusCode+"GET CALL Response Status Line:"+statusMessage);		
		Assert.assertEquals(statusCode,200);		
		String respStr = resp.asString();
		System.out.println("GET CALL Response as String:"+respStr);
	}
}
