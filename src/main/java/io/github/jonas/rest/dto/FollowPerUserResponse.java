package io.github.jonas.rest.dto;

import lombok.Data;

import java.util.List;

@Data
public class FollowPerUserResponse {

    private Integer followersCount;
    private List<FollowerResponse> content;



}
