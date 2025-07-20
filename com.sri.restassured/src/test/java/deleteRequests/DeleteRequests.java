package deleteRequests;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

/**
 * Step1: Install using npm with below command:
 * $ npm install -g json-server
 * 
 * Step2: Create a db.json locally so that it can be watched for any changes
 * Create a db.json in same folder path as ur current folder and with below json sample data
 * 
 * {
  "posts": [
    { "id": "1", "title": "a title", "views": 100 },
    { "id": "2", "title": "another title", "views": 200 }
  ],
  "comments": [
    { "id": "1", "text": "a comment about post 1", "postId": "1" },
    { "id": "2", "text": "another comment about post 1", "postId": "1" }
  ],
  "profile": {
    "name": "typicode"
  }
}
 * 
 * 
 * Step3: Start json-server 
 * npx json-server db.json
 * 
 * Step4: Hit below URI's to do testing using Rest Assured.
 * 
 * http://localhost:3000/posts
   http://localhost:3000/comments
   http://localhost:3000/profile
 * 
 * 
 */
public class DeleteRequests {

	@Test
	public void deleteMethod()
	{
		RestAssured.baseURI="http://localhost:3000";
		RequestSpecification request = RestAssured.given();
		//request.accept(ContentType.JSON);
		request.headers("Content-Type","application/json");
		Response resp = request.delete("/posts/10");
		int statusCode = resp.getStatusCode();
		String statusLine = resp.getStatusLine();
		String respString = resp.body().asPrettyString();
		
		System.out.println("DELETE Call Resp Code:"+statusCode+"DELETE Call Status Message:"+statusLine);
		System.out.println("DELETE Call Resp String:"+respString);
		Assert.assertEquals(statusCode,200);
	}
}
