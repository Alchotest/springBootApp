package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;
import javax.persistence.Id;
import java.util.Collection;

@Entity
@Data
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToMany(mappedBy = "roles")
    private Collection<User> users;
    private String name;

    public Role(String name) {
        this.name = name;
    }

    public Role() {
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
