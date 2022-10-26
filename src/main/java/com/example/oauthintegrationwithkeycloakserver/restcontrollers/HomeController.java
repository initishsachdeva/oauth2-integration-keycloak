package com.example.oauthintegrationwithkeycloakserver.restcontrollers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping(value = "/home")
    public String home() {
        return "Hey,wishing you and your family Happy Diwali !!";
    }
}
