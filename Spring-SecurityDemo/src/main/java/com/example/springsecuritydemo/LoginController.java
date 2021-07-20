package com.example.springsecuritydemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class LoginController {

    @GetMapping("/showMyLoginPage")
    public String showMyLoginPage() {

        return "demo-login";

    }

    @GetMapping("/access-denied")
    public String showAccessDenied() {

        return "access-denied";

    }
}
