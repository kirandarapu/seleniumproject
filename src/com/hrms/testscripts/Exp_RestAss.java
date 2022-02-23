package com.hrms.testscripts;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Exp_RestAss {
	  public static void main(String[] args) {
		
		Response res=RestAssured.get("https://reqres.in/api/users/2&quot");
		int statuscode=res.getStatusCode();  //to get the status code in restauured 
		System.out.println(statuscode);
		System.out.println(res.getTime()); // to get the response time
		
		
	}

}
