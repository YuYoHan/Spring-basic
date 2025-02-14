package org.example.oauth2.controller.artillery;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello~";
    }
}
