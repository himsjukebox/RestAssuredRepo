package restGithub;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class CreateRepo {

	@Test
	public void test1() {
	
		File dataFile = new File("Data.json");
		
		RestAssured
		.given()
		.auth()
		.oauth2("dummytoken")
		.baseUri("https://api.github.com")
		.contentType(ContentType.JSON)
		.accept(ContentType.JSON)
		.body(dataFile)
		.when()
		.post("user/repos")
		.then()
		.log()
		.all()
		.statusCode(201);
		
	}
	
}
