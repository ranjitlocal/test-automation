/**
 * 
 */
package com.test.automation.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * @author dell
 *
 */

@Path("test")
public class TestWebService {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response webService()
	{
		String string = "Welcome to first web-services";
		return Response.ok(string).build();
	}
}
