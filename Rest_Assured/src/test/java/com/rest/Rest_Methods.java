package com.rest;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Rest_Methods {
	
	public static void getMethod() {
		
		RestAssured.baseURI ="https://api.github.com/";
		
		String token = "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";
		
		String response = RestAssured.given().header("Authorization", "Bearer"+ token)
		
		.when().get("users/onodanaveen/repos")
		
		.then().extract().asString();
		
		System.out.println(response);

	}
	public static void postMethod() {
		
		RestAssured.baseURI ="https://api.github.com/";
		
		String token = "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";
		
		Response response = RestAssured.given().header("Authorization","Bearer "+ token)
		.body("{\r\n" + " \"name\": \"second-repo\"\r\n" + "}")
		.when().post("user/repos")
		.then().log().all().assertThat().statusCode(201).extract().response();
		
		System.out.println(response);
	}
	public static void putMethod() {
		
		RestAssured.baseURI ="https://api.github.com/";
		
		String token = "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";
		
		Response response = RestAssured.given().header("Authorization","Bearer "+ token)
				.body("{\r\n" + 
						"  \"names\": [\r\n" + 
						"    \"naveen\",\r\n" + 
						"    \"java\",\r\n" + 
						"    \"selenium\",\r\n" + 
						"    \"api\"\r\n" + 
						"  ]\r\n" + 
						"}").when().put("repos/onodanaveen/second-repo/topics")
				.then().log().all().assertThat().statusCode(200).extract().response();
		
		System.out.println(response);

	}
	
	public static void deleteMethod() {
		RestAssured.baseURI ="https://api.github.com/";
		
		String token = "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";
		
		Response response = RestAssured.given().header("Authorization","Bearer "+ token)
				.when().delete("repos/onodanaveen/second-repo")
				.then().log().all().assertThat().statusCode(204).extract().response();
		
		System.out.println(response);

	}
	public static void main(String[] args) {
	//	getMethod();
	//	postMethod();
	//	putMethod();
		deleteMethod();
	}

}
