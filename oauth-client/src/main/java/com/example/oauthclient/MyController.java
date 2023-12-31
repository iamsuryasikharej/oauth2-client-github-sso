package com.example.oauthclient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")

public class MyController {
    @GetMapping("/hello")
    public String hi()
    {
        return "hello from get";
    }


}
