package net.engineeringdigest.journalApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {

    @GetMapping("/health-check")
    public String healthCheck(){
        return "ok fine";
    }












//    @GetMapping()
//    public String healthCheck1(){
//        return "ok fine too";
//    }

}
