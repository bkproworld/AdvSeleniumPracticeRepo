package practice.CRUDOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RequestChainingApi {

	public static void main(String[] args) throws Throwable {
		
		
		//Request - Create user
		
		//Step 1
		FileInputStream fis = new FileInputStream("");
		//Step 2
		RequestSpecification req = RestAssured.given();
		req.body(fis);
		req.contentType(ContentType.JSON);
		
		Response resp = req.post("https://petstore.swagger.io/v2/store/order");
		
		//Step 3
		req.then().log().all();
		
		//Step 4
		
		
	}

}