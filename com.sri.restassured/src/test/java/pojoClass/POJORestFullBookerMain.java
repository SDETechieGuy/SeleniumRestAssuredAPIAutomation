package pojoClass;

import java.util.Map;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class POJORestFullBookerMain {

	BookingDates bookingdates;
	RestFulBooker obj;
	ObjectMapper objmap;
	
	@BeforeMethod
	public void setUp()
	{
		bookingdates = new BookingDates("2025-01-01","2025-03-01");
		obj = new RestFulBooker("Jayesh","Nagraj",22000,true,"super bowls",bookingdates);
		objmap = new ObjectMapper();
	}
	
	@Test(description="Test using default restassured for serialization and deserialization")
	public void PostCall_Serialization1() throws JsonProcessingException
	{
		
		bookingdates = new BookingDates("2025-01-01","2025-03-01");
		obj = new RestFulBooker("Jayesh","Nagraj",22000,true,"super bowls",bookingdates);
		objmap = new ObjectMapper();

		String payload = objmap.writerWithDefaultPrettyPrinter().writeValueAsString(obj);
		System.out.println("payload:"+payload);
		
			Response resp = RestAssured.given().
		            header("Content-Type","application/json")
		            .body(obj)
		            .when()
		            .post("https://restful-booker.herokuapp.com/booking")
		            .then().
		            assertThat().
		            statusCode(200)
		            .extract().response();
	}
	
	@Test(description="Test using Jackson for serialization and deserialization")
	public void PostCall_Serialization2() throws JsonProcessingException
	{		
		bookingdates = new BookingDates("2025-01-01","2025-03-01");
		obj = new RestFulBooker("Jayaraj","Nag",22000,true,"super bowls",bookingdates);
		objmap = new ObjectMapper();
		
		String jsonStr= objmap.writerWithDefaultPrettyPrinter().writeValueAsString(obj);
	    System.out.println(jsonStr);
		Response resp = RestAssured.given().
		            header("Content-Type","application/json")
		            .body(jsonStr)
		            .when()
		            .post("https://restful-booker.herokuapp.com/booking")
		            .then().
		            assertThat().
		            statusCode(200)
		            .extract().response();
		
		/*Method2: Using object of response class for deserialization */
		BookingResponse resp1 = objmap.readValue(resp.asString(),BookingResponse.class);
		System.out.println("Response as String:"+resp1.toString());
		System.out.println(resp1.getBookingid());
	   
		/*
		//Method3: Using map for de-serialization
		Map<String,Object> resp2 = objmap.readValue(resp.asString(),Map.class);
		System.out.println("Bookingid:"+resp2.get("bookingid"));
		*/
		
	}

}
