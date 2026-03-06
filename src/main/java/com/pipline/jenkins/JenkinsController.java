package com.pipline.jenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("jenkins")
public class JenkinsController {
    @GetMapping("welcome")
    public String message(){
        return "Welcome to Jenkins Pipeleine";
    }
    @GetMapping("hello")
    public String hello(){
        return "hello Jenkins";
    }
    //added comment for maven
}
