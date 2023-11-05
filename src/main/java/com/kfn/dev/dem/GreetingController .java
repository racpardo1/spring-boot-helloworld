
package com.kfn.dev.dem;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World! Your application is running";
    }
}