package com.dockerforjavadevelopers.hello;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class WelcomeController {
    
    @RequestMapping("/welcome")
    public String index() {
        return "Welcome to Bermtec\n";
    }
    
}
