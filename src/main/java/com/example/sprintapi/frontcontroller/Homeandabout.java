package com.example.sprintapi.frontcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Homeandabout {

    @GetMapping("Home")
    public String home(){
        System.out.println("Home page");
        return "Home Page";
    }

    @GetMapping("about")
    public String About(){
        System.out.println("About page");
        return "about Page";
    }

}
