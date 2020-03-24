package com.springboot.cart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.PushBuilder;

@Controller
public class LoginController {

    @GetMapping("/")
    public String mik(){
        return "mik";
    }

}
