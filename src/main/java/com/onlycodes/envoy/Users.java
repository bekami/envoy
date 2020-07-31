package com.onlycodes.envoy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;  

@RestController
public class Users {

    @GetMapping("/")
	public String[] hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        String[] names = {"SAD","LOL"};
        return names;
	}
}