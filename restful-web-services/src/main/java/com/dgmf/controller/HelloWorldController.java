package com.dgmf.controller;

import com.dgmf.entity.HelloWorldBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// This is a simple REST controller that handles HTTP GET requests
// to the "/hello-world" endpoint and returns a "Hello World!" message.
@RestController
public class HelloWorldController {
    // The @GetMapping annotation maps HTTP GET requests
    // to the helloWorld() method.
    @GetMapping(path = "/hello-world")
    public String helloWorld() {
        return "Hello World!";
    }

    // The @GetMapping annotation maps HTTP GET requests
    // to the helloWorldBean() method.
    @GetMapping(path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean() {
        // The helloWorldBean() method returns a new instance
        // of the HelloWorldBean class with the message
        // "Hello World Bean!"
        return new HelloWorldBean("Hello World Bean!");
    }
}
