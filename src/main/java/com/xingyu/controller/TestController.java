package com.xingyu.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testController")
public class TestController {
    @GetMapping("test")
    public ResponseEntity<Object> test(){
        System.out.println("test");
        return ResponseEntity.ok("test success");
    }
}
