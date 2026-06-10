package com.example.sprintapi.frontcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class login {

    @GetMapping("login")
    public String loginn()
    {
        return "Logged in";
    }
}
