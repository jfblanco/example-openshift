package com.example.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

    @RequestMapping(method = RequestMethod.GET, value = "/message")
    public String sendMessage(){
        return "It is working GET ALL";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/message/{id}")
    public String sendMessage(@PathVariable("id") String id){
        return "It is working GET:" + id;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/message")
    public String postMessage(){
        return "It is working GET POST";
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/message")
    public String putMessage(){
        return "It is working GET PUT";
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/message")
    public String deleteMessage(){
        return "It is working GET DELETE";
    }
}
