package com.Deployment.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/deploy")
public class Deployment {

    @GetMapping("/get")
    public String check(){
        return  "Welcome to Deployment World";
    }

    @GetMapping("/cd")
    public  String cicd(){
        return "Welcome to Cicd Pipeline";
    }
}
