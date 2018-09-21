package com.icarusrises.caseyellowweb.controllers;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/health")
    public Payload health() {
        return new Payload("WE got IT");
    }
}
