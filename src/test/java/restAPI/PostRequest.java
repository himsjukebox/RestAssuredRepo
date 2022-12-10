package restAPI;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class PostRequest {

	public void test1() {
		
		RestAssured.baseURI = "http://localhost:3000";
		
		RequestSpecification request = RestAssured.given();
		
//		Response response = request
//							.contentType(ContentType.JSON)
//							.accept(ContentType.JSON)
//							.body("{\r\n"
//									+" \"name\"}")
	}
	
}
