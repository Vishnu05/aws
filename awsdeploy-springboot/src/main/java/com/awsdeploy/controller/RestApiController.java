package com.awsdeploy.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aws")
public class RestApiController {

    @GetMapping
    public String hello() {
        return "Application is up and running";
    }
}
