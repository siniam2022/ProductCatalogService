package com.capstone.productcatalogservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFirstAPI {

    @GetMapping
    public String MyFirstAPI_call(){
        //comment
        return "Hello World!";
    }

}
