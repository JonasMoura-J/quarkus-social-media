package io.github.jonas.domain.repository;

import io.github.jonas.domain.model.Post;
import io.github.jonas.domain.model.User;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

public class PostRepository implements PanacheRepository<Post> {
}
