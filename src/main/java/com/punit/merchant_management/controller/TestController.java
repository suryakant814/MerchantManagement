package com.punit.merchant_management.controller;

import com.punit.merchant_management.TestModel;
import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping("/test")
public class TestController {

//    @GetMapping("/hello/{id}/{name}")
    public String helloWithPathVariable(@PathVariable String id, @PathVariable String name) {
        return "Hello, World! id = " + id + " name = " + name;
    }

    @GetMapping
//    @RequestMapping("/hello")
    public String helloWithRequestParam(@RequestParam String id, @RequestParam String name) {
        return "Hello, World! id = " + id + " name = " + name;
    }

    @PostMapping
    private String createTest(@RequestBody TestModel test) {
        System.out.println(test);
        return "Test created: " + test;
    }
}
