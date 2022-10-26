package com.example.oauthintegrationwithkeycloakserver.restcontrollers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserAdminViewController {

    @GetMapping(value = "/user-admin")
    public String home() {
        return "Hey user and admin ,wishing you and your family Happy Diwali !!";
    }
}
