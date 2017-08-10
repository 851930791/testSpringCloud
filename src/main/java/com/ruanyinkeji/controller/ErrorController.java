package com.ruanyinkeji.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/8/10 0010.
 */
@RestController
public class ErrorController {
    @RequestMapping("hello")
    public  String index(){
        return  "hello world";
    }
}
