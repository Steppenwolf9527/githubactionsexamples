package com.yanyu.githubactionsexamples;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("hello")
    public String hello() {
        return Map.of("name", "yanyu1", "age", 18).toString();
    }

}
