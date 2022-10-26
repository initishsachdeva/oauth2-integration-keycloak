package com.example.oauthintegrationwithkeycloakserver.restcontrollers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DashboardController {

    @GetMapping(value = "/dashboard")
    public String home() {
        return "Hey authenticated user ,wishing you and your family Happy Diwali !!";
    }
}
