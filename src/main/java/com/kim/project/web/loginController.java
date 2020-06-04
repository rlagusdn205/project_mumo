package com.kim.project.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class loginController {

    @GetMapping("/login123")
    public String loginForm(){

        return "loginForm";
    }
}
