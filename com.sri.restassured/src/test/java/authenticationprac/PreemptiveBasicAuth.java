package authenticationprac;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class PreemptiveBasicAuth extends BaseClass
{
	
	@Test
	public void preEmptBasicAuth()
	{
		int statusCode=RestAssured.
				given().
		        when().get().statusCode();
		
		Assert.assertEquals(statusCode, 200);		
	}
	

}
