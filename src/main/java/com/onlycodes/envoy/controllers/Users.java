package com.onlycodes.envoy.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.onlycodes.envoy.controllers.reqobjects.UserRequest;

@RestController
public class Users {

    @PostMapping(path = "/register", consumes = "application/json")
    public String register(@RequestBody UserRequest User) {
        System.out.println(User);
        return "SAD";
    }

    
}

    // @GetMapping("/")
    // public String[] getNames(@RequestParam(name = "name") String name){
    //     String[] names = {"SAD","LOL",name};
    //     return names;
    // }
    
    // @GetMapping("/object")
    // public HashMap<String,Object> getObject() {
    //     HashMap<String, Object> map = new HashMap<>();
    //     map.put("key1", "value1");
    //     map.put("results", "SAD");
    //     return map;
    // }