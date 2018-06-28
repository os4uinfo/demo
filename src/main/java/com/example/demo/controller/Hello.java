package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class Hello {
    @RequestMapping("/")
    public String sayHi(){
        //修改返回的字符串的内容
        return new Date() + "Hi, jenkins! " + new Data() ;
    }
}
