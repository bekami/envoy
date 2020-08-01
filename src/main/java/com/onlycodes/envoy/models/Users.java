package com.onlycodes.envoy.models;

import org.springframework.data.annotation.Id;
// import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
// import lombok.Getter;
// import lombok.Setter;
// import lombok.ToString;

@Data
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

    // @Override
    // public String toString() {
    //     return "Users [_id="+_id +", username=" + username+ "]";
    // }

}