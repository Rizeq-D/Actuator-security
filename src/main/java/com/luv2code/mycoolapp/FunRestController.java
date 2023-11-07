package com.luv2code.mycoolapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    //expose a "/" that returns "Hello World"

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World!!!";
    }

    //expose a new endpoints for "workout"

    @GetMapping("/workout")
    public String getDailyWorkOut() {
        return "Run a hard 5K!!";
    }

    @GetMapping("/fortune")
    public String getDailyFortune() {
        return "today is your lucky day!";
    }

}
