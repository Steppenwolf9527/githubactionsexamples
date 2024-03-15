package com.yanyu.githubactionsexamples;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return Map.of("name", "yanyu", "age", 18).toString();
    }

}
