package com.SpringbootApp.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @GetMapping(value = "hello")
    public String sayHi(){
        return "Welcome to Nepal";
    }
}