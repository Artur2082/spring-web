package com.hillel.springweb.servlet;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ping {
    //http://localhost:8080/ping
    @GetMapping("/ping")
    public String ok(){
        return "OK";
    }
}
