package com.firstline.oauth.controller;

import org.springframework.boot.autoconfigure.security.oauth2.resource.PrincipalExtractor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.Map;

@RestController
public class UserController {

    @RequestMapping("/user")
    public Principal user(Principal principal) {

        return principal;
    }
}
