package pojoClass;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class POJOMainUsingJackson {

	public static void main(String[] args) throws JsonProcessingException 
	{
		String[] sellers = {"ABC Corp Ltd","XYZ Consulting Pvt Ltd","Amazon Retailer"};
		POJOClassDemo obj = new POJOClassDemo("Lenovo G50",35000,"Black",sellers);
		
		//Serialization: Converting from Object to JSON/XML/HTML
		ObjectMapper objMap=new ObjectMapper();
		
		//Serialization
		String payloadPrettyStr = objMap.writerWithDefaultPrettyPrinter().writeValueAsString(obj);
		//String payloadString = objMap.writeValueAsString(obj);
		System.out.println(payloadPrettyStr);
		
		     Response resp= RestAssured.
                 		    given().
                 	        header("Content-Type","application/json")
		                    .body(payloadPrettyStr).
		                    when().
		                    post("URI")
		                    .then().statusCode(200)
		                    .extract().response();
		
		//De-serialization- Method1
		  POJOClassDemo respObj=objMap.readValue(resp.asString(),POJOClassDemo.class) ;
		
		  //Method2- Deserialization
		  POJOClassDemo obj1 = resp.as(POJOClassDemo.class);

	}

}
