package com.qq.taf.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yihengli
 * On 2018/7/4
 */
@RestController
public class HelloWorldController {
    @RequestMapping("/test")
    public String test() {
        return "hello world";
    }
}
