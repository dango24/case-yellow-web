package com.icarusrises.caseyellowweb.controllers;

import com.icarusrises.caseyellowweb.commands.LoginCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Slf4j
@Controller
public class WebPageController {

    @RequestMapping("/home")
    public String home() {
        return "index";
    }

    @RequestMapping("/login")
    public String login(Model model) {

        model.addAttribute("loginCommand", new LoginCommand());

        return "login";
    }

    @RequestMapping(value = "/docheckout", method = RequestMethod.POST)
    public String doCheckout(@Valid LoginCommand checkoutCommand, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "login";
        }

        return "checkoutcomplete";
    }
}
