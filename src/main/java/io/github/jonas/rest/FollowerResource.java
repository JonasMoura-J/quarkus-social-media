package io.github.jonas.rest;

import io.github.jonas.domain.model.Follower;
import io.github.jonas.domain.repository.FollowerRepository;
import io.github.jonas.domain.repository.UserRepository;
import io.github.jonas.rest.dto.FollowerRequest;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/users/{userId}/followers")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class FollowerResource {

    private final FollowerRepository followerRepository;
    private final UserRepository userRepository;

    @Inject
    public FollowerResource(FollowerRepository followerRepository, UserRepository userRepository){
        this.followerRepository = followerRepository;
        this.userRepository = userRepository;
    }

    @PUT
    public Response followUser(@PathParam("userId") Long userId, FollowerRequest request){
        var user = userRepository.findById(userId);
        if(userId == null){
           return Response.status(Response.Status.NOT_FOUND).build();
        }

        var follower = userRepository.findById(request.getFollowerId());



        Follower entity = new Follower(user, follower);
        followerRepository.persist(entity);

        return Response.status(Response.Status.NO_CONTENT).build();
    }

}
