package com.rest.webservices.practice.restful_web_services.helloworld;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

// REST API
@RestController
public class HelloWorldController {

    // /hello-world
    // <Method>Mapping is better than using RequestMapping with "method=RequestMethod.METHOD"
    @GetMapping(path = "/hello-world")
    public String helloWorld() {
        return "Hello World";
    }


}
