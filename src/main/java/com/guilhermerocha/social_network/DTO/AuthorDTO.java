package com.guilhermerocha.social_network.DTO;

import com.guilhermerocha.social_network.domain.User;

import java.io.Serializable;

public class AuthorDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id;
    private  String name;

    public AuthorDTO() {
    }

    public AuthorDTO(User user) {
        this.id = getId();
        this.name = getName();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
