package authorizationPrac;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class OAuthDemo 
{
	
	@Test
	public void testOAuth()
	{
		Response resp= RestAssured.given()
				        .auth().
				        oauth("WjZfmTlYIpKxifdmN1Jh5iU3h","sb53OuBWiT82gWHJhZ7iEWmBYfYxYYm07hldrjRBQa9I0XKSJO","1948952707634790406-bVW4BsDhaa4JG7wAyOSf2cadjwyQzd","rvaaKMF872X6SVnKeUX8BKpHhoEfoOcM1AJ6SqoFbLB4E")
				        .post("https://api.twitter.com/1.1/statuses/update.json?status=This is my first tweet");
	   System.out.println("StatusCode: "+resp.statusCode());
	   System.out.println("Status Message: "+ resp.statusLine());
	   Assert.assertEquals(resp.statusCode(),200);
	}

}
