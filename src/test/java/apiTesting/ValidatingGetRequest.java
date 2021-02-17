package apiTesting;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ValidatingGetRequest {
	
	@Test
	public void getRequest() {
		RestAssured.baseURI ="http://restapi.demoqa.com/utilities/weather/city";
		
		RequestSpecification httpRequest= RestAssured.given();
		
		Response response = httpRequest.request(Method.GET,"/Bangalore");
		
		//print response
		
		String responsebody =response.getBody().asString();
		
		System.out.println("response body is: "+responsebody);
	}

}
