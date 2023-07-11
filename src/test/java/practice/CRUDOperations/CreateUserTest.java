package practice.CRUDOperations;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateUserTest {

	public static void main(String[] args) {
//pull back

		//Step 1: Create the necessary Data
		JSONObject obj= new JSONObject();
		obj.put("name", "banti");
		obj.put("job", "engineer");
		
		//Step 2: send the request
		RequestSpecification req = RestAssured.given();
		req.body(obj);
		req.contentType(ContentType.JSON);
		Response resp =req.post("https://reqres.in/api/users");
		
		
		//Step 3: Validate the response
		
		resp.then().log().all();
		System.out.println(resp.getContentType());
		System.out.println(resp.statusCode());
		System.out.println(resp.getStatusLine());
		
		resp.then().assertThat().statusCode(201);
		
		

	}

}
