package com.codegym.demosecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    @GetMapping(value = {"/", "/home"})
    public String homepage() {
        return "home";
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}
