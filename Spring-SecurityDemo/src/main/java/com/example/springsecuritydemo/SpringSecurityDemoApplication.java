package com.example.springsecuritydemo;

import jdk.nashorn.internal.ir.RuntimeNode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringSecurityDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityDemoApplication.class, args);
    }

    @GetMapping("/users")
    public String sayHello(@RequestParam(value = "myName", defaultValue = "world") String name) {
        return String.format("Users: Hello %s!", name);
    }

    @GetMapping("/admin")
    public String sayAdmin(@RequestParam(value = "myName", defaultValue = "world") String name) {
        return String.format("Admin: Hello %s!", name);
    }

}
