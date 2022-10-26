package com.example.oauthintegrationwithkeycloakserver.restcontrollers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserViewController {

    @GetMapping(value = "/user")
    public String home() {
        return "Hey user ,wishing you and your family Happy Diwali !!";
    }
}
