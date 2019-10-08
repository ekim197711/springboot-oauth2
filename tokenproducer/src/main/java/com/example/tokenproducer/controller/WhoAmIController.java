package com.example.tokenproducer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class WhoAmIController {

    @GetMapping("/whoami")
    public Principal whoAMI(Principal principal) {
        return principal;
    }
}
