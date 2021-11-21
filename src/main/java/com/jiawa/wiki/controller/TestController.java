package com.jiawa.wiki.controller;

import com.jiawa.wiki.domain.Test;
import com.jiawa.wiki.service.TestService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class TestController {
//    获取配置项里面的配置
//  @Value("${test.hello:Test}") 默认配置
    @Value("${test.hello}")
    private String testHello;
    @Resource
    private TestService testService;

    @GetMapping("/hello")
    public String hello(){
        return "hello Worlda "+testHello;
    }

    @PostMapping("/hello/post")
    public String helloPost(String name){
        return "hello World Post " + name;
    }
    // 查询出来返回一个数组对象
    @GetMapping("/test/list")
    public List<Test> list(){
        return testService.list();
    }


}
