package com.icarusrises.caseyellowweb.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
public class HomePageController {

    @RequestMapping("/home")
    public String userDetails() {
        return "index";
    }
}
