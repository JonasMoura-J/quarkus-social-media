package io.github.jonas.domain.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Integer age;

    public User(){

    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
