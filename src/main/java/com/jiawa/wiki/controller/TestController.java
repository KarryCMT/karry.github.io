package com.jiawa.wiki.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
//    获取配置项里面的配置
//  @Value("${test.hello:Test}") 默认配置
    @Value("${test.hello}")
    private String testHello;

    @GetMapping("/hello")
    public String hello(){
        return "hello World！"+testHello;
    }

    @PostMapping("/hello/post")
    public String helloPost(String name){
        return "hello World Post " + name;
    }
}
