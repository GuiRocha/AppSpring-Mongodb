package com.guilhermerocha.social_network.model.DTO;

import com.guilhermerocha.social_network.model.Post;
import com.guilhermerocha.social_network.model.User;

import java.io.Serializable;

public class UserDTO implements Serializable{
    private static final long seriaVersionUID = 1L;

    private String id;
    private String name;
    private String email;

    public UserDTO(Post obj){

    }
    public UserDTO(User obj){
        id = obj.getId();
        name = obj.getName();
        email = obj.getEmail();
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
