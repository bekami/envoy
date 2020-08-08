package com.onlycodes.envoy.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class Users {
    @Id
    private String _id;

    // @Indexed(unique = true)
    private final String username;

    // @Indexed(unique = true)
    private final String email;
    
    private final String password;

    public Users(final String username, final String email, final String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public void display() {
        System.out.println("User " + _id +" "+  username + " " + email);
    }

    @Override
    public String toString() {
        return "Users [_id="+_id +", username=" + username+", email=" + email+", password=" + password+ "]";
    }

    public String get_Id() {
        return _id;
    }
    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

}