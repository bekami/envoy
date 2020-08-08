package com.onlycodes.envoy.controllers;

import com.onlycodes.envoy.repos.UsersRepository;
import com.onlycodes.envoy.models.Users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class UsersContoller {
    @Autowired
    UsersRepository repo;

    @PostMapping("/users")
    public String addUser(@RequestBody Users user) {
        repo.save(user);
        return "Sukkcesfull person";
    }

    @GetMapping("/users")
    public List<Users> getUsers() {
        List<Users> users = repo.findAll();
        for (Users user: users) {
            user.display();
            System.out.println(user.toString());
        }
        return users;
    }


    @GetMapping("/users/{id}")
    public Optional<Users> getUser(@PathVariable("id") String id) {
        Optional<Users> user = repo.findById(id);
        user.get().display();
        return user;
    }


}