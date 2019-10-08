package com.example.tokenproducer.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@Slf4j
public class WhoAmIController {

    @GetMapping("/showprincipal")
    public Principal showPrincipal(Principal principal){
        log.info("type of principal: " + principal.getClass().getName());
        return principal;
    }

}
