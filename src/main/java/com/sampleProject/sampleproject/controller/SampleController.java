package com.sampleProject.sampleproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
    @GetMapping("/result")
    public String getResult(){
        return "Application Deployment on AWS";
    }
}
