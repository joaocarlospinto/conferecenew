package com.pluralsight.conferecenew.controller;

import com.pluralsight.conferecenew.model.Registration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Map;

@Controller
public class RegistrationController {

    @GetMapping("registration")
    public String getRegistrarion(@ModelAttribute("registration") Registration registration) {
        return "registration";
    }

    @PostMapping("registration")
    public String addRegistrarion(@ModelAttribute("registration") Registration registration) {
        System.out.println("registration: " + registration.getName());
        return "registration";
    }

}
