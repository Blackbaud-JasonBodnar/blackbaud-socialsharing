package com.blackbaud.socialsharing.resources;

import com.blackbaud.socialsharing.representations.PublishUserActionRequest;

import javax.validation.Valid;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.validation.Validator;

/**
 * Created by jbodnar on 7/11/14.
 */
@Path("/userAction")
@Produces(MediaType.APPLICATION_JSON)
public class UserActionResource
{
	@POST
	public Response publish(@Valid PublishUserActionRequest request)
	{
		return Response.created(null).build();
	}
}
