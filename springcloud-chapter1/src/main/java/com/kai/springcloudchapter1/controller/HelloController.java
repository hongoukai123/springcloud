package com.kai.springcloudchapter1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hok on 2018/9/10.
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String index(){
        return "Hello World!";
    }

}
