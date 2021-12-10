package com.devops.learning.dockerspringboot.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/docker/devops")
public class HelloDevops {
    @GetMapping
    public String devops(){
        return "Docker integration with jenkins Ended";
    }
}
