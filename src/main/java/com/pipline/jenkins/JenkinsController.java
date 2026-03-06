package com.pipline.jenkins;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("jenkins")
public class JenkinsController {
    public String message(){
        return "Welcome to Jenkins Pipeleine";
    }
    public String hello(){
        return "hello Jenkins";
    }
}
