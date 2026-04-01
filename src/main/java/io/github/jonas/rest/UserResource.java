package io.github.jonas.rest;

import io.github.jonas.dto.CreateUserRequest;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@Path("/users")
public class UserResource {

    @POST
    public Response createUser(CreateUserRequest user){
        return Response.ok().build();
    }
}
