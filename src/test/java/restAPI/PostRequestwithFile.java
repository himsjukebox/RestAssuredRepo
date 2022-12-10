package restAPI;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostRequestwithFile {

	@Test
	public void test1() throws IOException {
		
		byte[] dataFile = Files.readAllBytes(Paths.get("Data.json"));
		File myFile = new File("Data.json");
		RestAssured.baseURI = "http://localhost:3000";
		RequestSpecification request = RestAssured.given();
		
		
		Response response = request
							.contentType(ContentType.JSON)
							.accept(ContentType.JSON)
//							.body(dataFile)
							.body(myFile)
							.post("employees/create");
		
		System.out.println(response.getBody().asString());
		
		int responseCode = response.getStatusCode();
		Assert.assertEquals(201, responseCode);
	}

	
}
