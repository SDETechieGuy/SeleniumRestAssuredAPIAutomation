package postRequests;

import org.json.simple.JSONObject;
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
public class PostRequests {

	@Test
	public void postMethod()
	{
		RestAssured.baseURI="http://localhost:3000";
		RequestSpecification request = RestAssured.given();
		//request.accept(ContentType.JSON);
		request.headers("Content-Type","application/json");
		JSONObject jsonObj = new JSONObject();
		jsonObj.put("id",15);
		jsonObj.put("title", "15th title");
		jsonObj.put("views",500);
		Response resp = request.body(jsonObj.toJSONString()).post("/posts");
		int statusCode = resp.getStatusCode();
		String statusLine = resp.getStatusLine();
		String respString = resp.body().asPrettyString();
		
		System.out.println("Resp Code:"+statusCode+" Status Message:"+statusLine);
		System.out.println("Resp String:"+respString);
		
	}
}
