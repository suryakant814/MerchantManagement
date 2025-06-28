package com.punit.merchant_management.controller;


import com.punit.merchant_management.model.TestModel;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping
    @RequestMapping("/hello/pathvar/{name}")
    public String helloWithPathVariable(@PathVariable String name) {
        return "hello name = " + name;
    }

    @GetMapping
    @RequestMapping("/hello/reqparam")
    public String helloWithRequestParam(@RequestParam String name, @RequestParam int id){
        return "hello name = "+ name +" id = " +id ;
    }

    @PostMapping
    @RequestMapping
    public String postMapping(@RequestBody TestModel testModel){
        return testModel.toString();
    }

}
